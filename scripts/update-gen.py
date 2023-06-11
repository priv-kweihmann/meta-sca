#! /usr/bin/env python3
import argparse
import glob
import json
import os
import re
import subprocess
import urllib.request

import git

failure_log = os.path.join(os.path.dirname(__file__), 'failure.log')


def create_parser():
    parser = argparse.ArgumentParser()
    parser.add_argument("repo", help="Repo path")
    return parser.parse_args()


def get_real_package_name_go(_args, recipe):
    try:
        out = subprocess.check_output(
            ["/bin/sh", "-c", "bitbake -e {} | grep ^GO_IMPORT=".format(recipe)], universal_newlines=True)
        out = out.replace("GO_IMPORT=", "", 1).strip('" \n')
    except subprocess.CalledProcessError as e:
        print(e)
        out = ""
    return out


def run_package_update_pypi(_args, packagename, version):
    try:
        subprocess.check_call(["python3", os.path.join(_args.repo, "scripts", "pypi-update.py"),
                               f'--faillog={failure_log}', _args.repo, packagename, version], universal_newlines=True)
        return (True, 1)
    except:
        return (False, 1)


def run_package_update_perl(_args, packagename, version):
    try:
        subprocess.check_call(["python3", os.path.join(_args.repo, "scripts", "perl-update.py"),
                               f'--faillog={failure_log}', _args.repo, packagename, version], universal_newlines=True)
        return (True, 1)
    except:
        return (False, 1)


def is_go_package(_args, title):
    m = re.match(r"Update (?P<recipe>.*) to (?P<version>.*)", title)
    if m:
        if any(glob.glob(os.path.join(_args.repo, "recipes-go", m.group("recipe") + "_*.bb"))):
            return True
    return False


def run_package_update_go(_args, packagename, version):
    try:
        _pargs = ["python3", os.path.join(
            _args.repo, "scripts", "go-gen")]
        _pargs += ["--version={}".format(version)]
        _pargs += ["--keepdepversion"]
        _pargs += [os.path.join(_args.repo, "recipes-go"),
                   packagename]
        subprocess.check_call(_pargs, universal_newlines=True)
        return (True, 1)
    except:
        return (False, 1)


def git_commit(_args, recipe, version, issue, numchanges):
    __git = git.Repo(path=_args.repo)
    _nr = len(__git.untracked_files)
    if _nr > numchanges:
        input("More than {} changes, your problem now - press any key then you're done".format(numchanges))
    elif _nr < 1:
        # Nothing to do here - seems to updated already
        return
    else:
        __git.git.add("*")
        _msg = """Update {} to {}

Closes #{}
        """.format(recipe, version, issue)
        __git.git.commit(message=_msg)


def run_bitbake_test(_args, recipe):
    __git = git.Repo(path=_args.repo)
    _recipes = []
    for _f in __git.untracked_files:
        _base = os.path.basename(_f)
        if _base.endswith(".bb"):
            _recipes.append("_".join(_base.split("_")[:-1]))
    if any(_recipes):
        try:
            subprocess.check_call(["bitbake"] + _recipes,
                                  universal_newlines=True)
        except:
            input("Build failed - check and press enter when okay")
            run_bitbake_test(_args, recipe)
    return True


def get_nativesdk_recipe(pkgname):
    m = re.match(r'(?P<name>.*)-native$', pkgname)
    return 'nativesdk-' + m.group('name')


def run_sdkgen(_args):
    _pargs = [os.path.join(_args.repo, "scripts", "sdk-gen"),
              f"--ignores={_args.repo}/.nonsdkable", _args.repo]
    subprocess.check_call(_pargs, universal_newlines=True)


def run_unused(_args):
    try:
        _pargs = [os.path.join(_args.repo, "..", "meta-buildutils", "scripts", "unused"),
                  "--remove", _args.repo]
        subprocess.check_call(_pargs, universal_newlines=True)
    except Exception as e:
        print(e)


def update_packages(_args, _input, number):
    m = re.match(r"Update (?P<recipe>.*) to (?P<version>.*)", _input)
    if m:
        _update = None
        _allowed_changes = 0
        _recipe = m.group("recipe")
        _skip = False
        if _recipe.startswith("python3-"):
            if os.environ.get("NO_PYTHON", ""):
                _skip = True
            else:
                _update, _allowed_changes = run_package_update_pypi(
                    _args, _recipe, m.group("version"))
        elif _recipe.startswith("perl-"):
            if os.environ.get("NO_PERL", ""):
                _skip = True
            else:
                _update, _allowed_changes = run_package_update_perl(
                    _args, _recipe, m.group("version"))
        elif is_go_package(_args, _input):
            if os.environ.get("NO_GO", ""):
                _skip = True
            else:
                _pkgname = get_real_package_name_go(_args, _recipe)
                if _pkgname:
                    _update, _allowed_changes = run_package_update_go(
                        _args, _pkgname, m.group("version"))
        if _update:
            if run_bitbake_test(_args, _recipe):
                git_commit(_args, _recipe,
                           m.group("version"), number, _allowed_changes)
                _recipe = get_nativesdk_recipe(_recipe)
                run_sdkgen(_args)
                run_unused(_args)
                if run_bitbake_test(_args, _recipe):
                    git_commit(_args, _recipe,
                               m.group("version"), number, _allowed_changes)
                    return 1
                return 1
        elif _skip:
            print("Skipped {recipe}".format(recipe=_recipe))
        else:
            print(
                "Failed to update {recipe} - skipping".format(recipe=_recipe))
    return 0


def is_updateable(_args, title):
    if title.startswith("Update python3-") or \
       title.startswith("Update perl-"):
        return True
    return is_go_package(_args, title)


def get_issues(_args):
    res = []
    for i in range(1, 100, 1):
        with urllib.request.urlopen("https://api.github.com/repos/priv-kweihmann/meta-sca/issues?state=open&sort=created-asc&page={}".format(i)) as url:
            data = json.loads(url.read().decode())
            if data:
                res += data
            else:
                break
    return res


_args = create_parser()
data = get_issues(_args)
_updated_items = 0
with open(failure_log, 'w') as o:
    o.write('')
for item in data:
    if item["state"] == "open" and is_updateable(_args, item["title"]):
        if any(x["name"] == "Postponed" for x in item["labels"]):
            continue
        if any(x["name"] == "Prerelease" for x in item["labels"]):
            continue
        print("Attempting {}".format(item["title"]))
        _updated_items += update_packages(_args,
                                          item["title"], item["number"])

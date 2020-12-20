#! /usr/bin/env python3
import argparse
import json
import os
import re
import subprocess
import urllib.request

import git


def create_parser():
    parser = argparse.ArgumentParser()
    parser.add_argument("repo", help="Repo path")
    return parser.parse_args()


def get_real_package_name_npm(_args, recipe):
    try:
        out = subprocess.check_output(
            ["/bin/sh", "-c", "bitbake -e {} | grep ^NPM_PKGNAME=".format(recipe)], universal_newlines=True)
        out = out.replace("NPM_PKGNAME=", "", 1).strip('" \n')
    except subprocess.CalledProcessError as e:
        print(e)
        out = ""
    return out


def get_real_package_name_ruby(_args, recipe):
    try:
        out = subprocess.check_output(
            ["/bin/sh", "-c", "bitbake -e {} | grep ^GEM_NAME=".format(recipe)], universal_newlines=True)
        out = out.replace("GEM_NAME=", "", 1).strip('" \n')
    except subprocess.CalledProcessError as e:
        print(e)
        out = ""
    return out


def run_package_update_npm(_args, packagename, version):
    try:
        subprocess.check_call(["python3", os.path.join(_args.repo, "scripts", "npm-gen.py"),
                               os.path.join(_args.repo, "recipes-nodejs"),
                               packagename, version], universal_newlines=True)
        return True
    except:
        return False


def run_package_update_pypi(_args, packagename, version):
    try:
        subprocess.check_call(["python3", os.path.join(_args.repo, "scripts", "pypi-update.py"),
                               _args.repo, packagename, version], universal_newlines=True)
        return True
    except:
        return False


def run_package_update_perl(_args, packagename, version):
    try:
        subprocess.check_call(["python3", os.path.join(_args.repo, "scripts", "perl-update.py"),
                               _args.repo, packagename, version], universal_newlines=True)
        return True
    except:
        return False


def run_package_update_ruby(_args, packagename, version, target=False):
    try:
        _pargs = ["python3", os.path.join(
            _args.repo, "scripts", "ruby-gen.py")]
        if target:
            _pargs += ["--target"]
        _pargs += [os.path.join(_args.repo, "recipes-ruby"),
                   packagename, version]
        subprocess.check_call(_pargs, universal_newlines=True)
        return True
    except:
        return False


def git_commit(_args, recipe, version, issue):
    __git = git.Repo(path=_args.repo)
    _nr = len(__git.untracked_files)
    if _nr > 1:
        input("More than 2 changes, your problem now - press any key then you're done")
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
    try:
        subprocess.check_call(["bitbake", recipe], universal_newlines=True)
    except:
        input("Build failed - check and press enter when okay")
        run_bitbake_test(_args, recipe)
    return True


def update_packages(_args, _input, number):
    m = re.match(r"Update (?P<recipe>.*) to (?P<version>.*)", _input)
    if m:
        _update = None
        _recipe = m.group("recipe")
        if _recipe.startswith("npm-"):
            _pkgname = get_real_package_name_npm(_args, _recipe)
            if _pkgname:
                _update = run_package_update_npm(
                    _args, _pkgname, m.group("version"))
        elif _recipe.startswith("python3-"):
            _update = run_package_update_pypi(
                _args, _recipe, m.group("version"))
        elif _recipe.startswith("perl-"):
            _update = run_package_update_perl(
                _args, _recipe, m.group("version"))
        elif _recipe.startswith("ruby-"):
            _pkgname = get_real_package_name_ruby(_args, _recipe)
            if _pkgname:
                _update = run_package_update_ruby(_args, _pkgname, m.group(
                    "version"), target=False if _recipe.endswith("-native") else True)
        if _update:
            if run_bitbake_test(_args, _recipe):
                git_commit(_args, _recipe,
                           m.group("version"), number)
                return 1
        else:
            print(
                "Failed to update {recipe} - skipping".format(recipe=_recipe))
    return 0

_args = create_parser()
with urllib.request.urlopen("https://api.github.com/repos/priv-kweihmann/meta-sca/issues?state=open") as url:
    data = json.loads(url.read().decode())
    _updated_items = 0
    for item in data:
        if item["state"] == "open" and any(x in item["title"] for x in ["npm-", "python3-", "perl-", "ruby-"]):
            if any(x["name"] == "Postponed" for x in item["labels"]):
                continue
            print("Attempting {}".format(item["title"]))
            _updated_items += update_packages(_args, item["title"], item["number"])
    if _updated_items > 0:
        try:
            _pargs = [os.path.join(_args.repo, "..", "meta-buildutils", "scripts", "unused"),
                      "--remove", _args.repo]
            subprocess.check_call(_pargs, universal_newlines=True)
        except:
            pass

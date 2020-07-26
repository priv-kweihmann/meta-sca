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


def get_real_package_name(_args, recipe):
    try:
        out = subprocess.check_output(
            ["/bin/sh", "-c", "bitbake -e {} | grep ^NPM_PKGNAME=".format(recipe)], universal_newlines=True)
        out = out.replace("NPM_PKGNAME=", "", 1).strip('" \n')
    except subprocess.CalledProcessError as e:
        print(e)
        out = ""
    return out


def run_package_update(_args, packagename, version):
    try:
        subprocess.check_call(["python3", os.path.join(_args.repo, "scripts", "npm-gen.py"),
                               os.path.join(_args.repo, "recipes-nodejs"),
                               packagename, version], universal_newlines=True)
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
        return True
    except:
        return False


def update_packages(_args, _input, number):
    m = re.match(r"Update (?P<recipe>.*) to (?P<version>.*)", _input)
    if m:
        _pkgname = get_real_package_name(_args, m.group("recipe"))
        if _pkgname:
            if run_package_update(_args, _pkgname, m.group("version")) and \
               run_bitbake_test(_args, m.group("recipe")):
                git_commit(_args, m.group("recipe"),
                           m.group("version"), number)


_args = create_parser()
with urllib.request.urlopen("https://api.github.com/repos/priv-kweihmann/meta-sca/issues") as url:
    data = json.loads(url.read().decode())
    for item in data:
        if item["state"] == "open" and "npm-" in item["title"]:
            print("Attempting {}".format(item["title"]))
            update_packages(_args, item["title"], item["number"])

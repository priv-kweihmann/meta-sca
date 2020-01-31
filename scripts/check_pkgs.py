#! /usr/bin/env python3
# This script checks all recipes from this layer for updates
# and creates GitHub issues from that info

import argparse
import re
import os
import subprocess

import github3

UPDATE_FORMAT = "Update {} to {}"
UPDATE_REGEX = r"Update\s+{}\s+to\s+.*"


def create_parser():
    parser = argparse.ArgumentParser()
    parser.add_argument("--blacklistfile", default=None, help="File with blacklisted packages")
    parser.add_argument("username", help="GitHub username")
    parser.add_argument("token", help="GitHub token")
    return parser.parse_args()


def get_updates():
    try:
        layer_list = subprocess.check_output(["bitbake-layers", "show-recipes", "-l", "meta-sca", "-b"],
                                             universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        layer_list = e.stdout or ""

    layer_list = [x.strip().rstrip(":")
                  for x in layer_list.split("\n") if ":" in x]

    try:
        devtool_out = subprocess.check_output(["devtool", "check-upgrade-status"] + layer_list,
                                              universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        devtool_out = e.stdout or ""

    pattern = r"^INFO:\s+(?P<recipe>[A-Za-z0-9\+\.\-_]+)\s+(?P<curversion>[A-Za-z0-9\.\-_]+)\s+(?P<nextversion>[A-Za-z0-9\.\-_]+)\s+.*"
    res = []
    for m in re.finditer(pattern, devtool_out, re.MULTILINE):
        if m.group("nextversion") not in ["UNKNOWN_BROKEN"]:
            print(UPDATE_FORMAT.format(m.group("recipe"),
                                       m.group("nextversion").rstrip(".")))
            res.append((m.group("recipe"), m.group("nextversion").rstrip(".")))
    return res

def get_blacklist(_file):
    if os.path.exists(_file):
        with open(_file) as i:
            return [x.strip("\n") for x in i.readlines() if x]
    return []

if __name__ == '__main__':
    _args = create_parser()
    updates = get_updates()
    login = github3.login(_args.username, _args.token)
    repo = login.repository('priv-kweihmann', 'meta-sca')
    issue_list = [issue for issue in repo.issues(state="open")]
    _blacklist = get_blacklist(_args.blacklistfile)
    print(_blacklist)
    for up in updates:
        if up[0] in _blacklist:
            continue
        # 1. no issue open found -> Create one
        # 2. issue found -> alter title, remove staging label (if present)
        matches = [x for x in issue_list if re.match(UPDATE_REGEX.format(up[0]), x.title)]
        if any(matches):
            print("Alter issue from {}:{} -> {}:{}".format(matches[0].title,
                  matches[0].original_labels,
                  UPDATE_FORMAT.format(up[0], up[1]),
                  [str(x) for x in matches[0].original_labels if str(x) != "Staging"] + ["Update Bot"]))
            matches[0].edit(title=UPDATE_FORMAT.format(up[0], up[1]), 
                            labels=[str(x) for x in matches[0].original_labels if str(x) != "Staging"] + ["Update Bot"])
        else:
            print("Create new issue {}:{}".format(UPDATE_FORMAT.format(
                up[0], up[1]), ["Package Update", "Update Bot"]))
            repo.create_issue(title=UPDATE_FORMAT.format(up[0], up[1]), labels=["Package Update", "Update Bot"])

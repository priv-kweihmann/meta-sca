#! /usr/bin/env python3
# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) 2020, Konrad Weihmann
# This script checks all recipes from this layer for updates
# and creates GitHub issues from that info

import argparse
import os
import random
import re
import subprocess
import time

import github3

UPDATE_FORMAT = "Update {} to {}"
UPDATE_REGEX = r"Update\s+{}\s+to\s+.*"


def create_parser():
    parser = argparse.ArgumentParser()
    parser.add_argument("--blacklistfile", default=None, help="File with blacklisted packages")
    parser.add_argument("--dryrun", default=False, action="store_true", help="dry run")
    parser.add_argument("--filter", default=".*", help="additional recipe name filter")
    parser.add_argument("--backoff", default=180, type=int, help="backoff time after UNKNOWN_BROKEN finding. 0=disabled")
    parser.add_argument("username", help="GitHub username")
    parser.add_argument("token", help="GitHub token")
    return parser.parse_args()


def get_updates(_blacklist, _args):
    try:
        layer_list = subprocess.check_output(["bitbake-layers", "show-recipes", "-l", "meta-sca", "-b"],
                                             universal_newlines=True, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        layer_list = e.stdout or ""

    __beginmarker = "=== Available recipes: ==="
    layer_list = layer_list[layer_list.find(__beginmarker) + len(__beginmarker):]

    layer_list = [x.strip().rstrip(":")
                  for x in layer_list.split("\n") if ":" in x]

    random.shuffle(layer_list)
    devtool_out = ""
    res = []
    for l in layer_list:
        if l in _blacklist or not re.match(_args.filter, l):
            continue
        print("Checking {}...".format(l), end='', flush=True)
        try:
            devtool_out = subprocess.check_output(["devtool", "check-upgrade-status"] + [l],
                                                   universal_newlines=True, 
                                                   stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            devtool_out = e.stdout or ""
        pattern = r"^INFO:\s+(?P<recipe>[A-Za-z0-9\+\.\-_]+)\s+(?P<curversion>[A-Za-z0-9\.\-_]+)\s+(?P<nextversion>[A-Za-z0-9\.\-_]+)\s+.*"
        for m in re.finditer(pattern, devtool_out, re.MULTILINE):
            if m.group("nextversion") not in ["UNKNOWN_BROKEN", "new"]:
                if m.group("nextversion").rstrip(".") == m.group("curversion"):
                    continue
                if m.group("recipe") not in layer_list:
                    continue
                print("update to {} found...".format(m.group("nextversion").rstrip(".")), end='', flush=True)
                res.append((m.group("recipe"), m.group("nextversion").rstrip(".")))        
            elif m.group("nextversion") in ["UNKNOWN_BROKEN"]:
                print("Unknown broken...", end='', flush=True)
                if _args.backoff > 0:
                    time.sleep(_args.backoff)
        pattern = r"^INFO:\s+(?P<recipe>[A-Za-z0-9\+\.\-_]+)\s+(?P<curversion>[A-Za-z0-9\.\-_]+)\s+new\scommits\s+.*\s+(?P<rev>[a-f0-9]{2,})"
        for m in re.finditer(pattern, devtool_out, re.MULTILINE):
            if m.group("recipe") not in layer_list:
                continue
            print("update to {} found...".format(m.group("rev").rstrip(".")), end='', flush=True)
            res.append((m.group("recipe"), m.group("rev").rstrip(".")))
        print("[done]", flush=True)
    return res

def get_blacklist(_file):
    if os.path.exists(_file):
        with open(_file) as i:
            return [x.strip("\n") for x in i.readlines() if x]
    return []

if __name__ == '__main__':
    _args = create_parser()
    _blacklist = get_blacklist(_args.blacklistfile)
    updates = get_updates(_blacklist, _args)
    login = github3.login(_args.username, _args.token)
    repo = login.repository('priv-kweihmann', 'meta-sca')
    issue_list = [issue for issue in repo.issues(state="open")]
    for up in updates:
        if up[0] in _blacklist:
            continue
        # 1. no issue open found -> Create one
        # 2. issue found -> alter title, remove staging label (if present)
        matches = [x for x in issue_list if re.match(UPDATE_REGEX.format(up[0]), x.title)]
        # if exact issue text found -> continue
        if any([x for x in issue_list if x.title == UPDATE_FORMAT.format(up[0], up[1])]):
            continue
        if any(matches):
            print("Alter issue from {}:{} -> {}:{}".format(matches[0].title,
                  matches[0].original_labels,
                  UPDATE_FORMAT.format(up[0], up[1]),
                  [str(x) for x in matches[0].original_labels if str(x) != "Staging"] + ["Update Bot"]))
            if not _args.dryrun:
                matches[0].edit(title=UPDATE_FORMAT.format(up[0], up[1]), 
                                labels=[str(x) for x in matches[0].original_labels if str(x) != "Staging"] + ["Update Bot"])
        else:
            print("Create new issue {}:{}".format(UPDATE_FORMAT.format(
                up[0], up[1]), ["Package Update", "Update Bot"]))
            if not _args.dryrun:
                repo.create_issue(title=UPDATE_FORMAT.format(up[0], up[1]), labels=["Package Update", "Update Bot"])

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
    parser.add_argument("--blacklistfile", default="", help="File with blacklisted packages")
    parser.add_argument("--dryrun", default=False, action="store_true", help="dry run")
    parser.add_argument("--filter", default=".*", help="additional recipe name filter")
    parser.add_argument("--backoff", default=60, type=int, help="backoff time after UNKNOWN_BROKEN finding. 0=disabled")
    parser.add_argument("username", help="GitHub username")
    parser.add_argument("token", help="GitHub token")
    return parser.parse_args()

def check_gh_prerelease(login, repo, version):
    if not repo:
        return ([], [])
    _repo_chunks = repo.split("/")
    try:
        _repo = login.repository(_repo_chunks[0], _repo_chunks[1])
        for release in _repo.releases():
            _name = release.tag_name.lstrip("v")
            if version in _name:
                print("Found GH release {} -- prerelease {}".format(version, release.prerelease))
                if release.prerelease:
                    return (['Prerelease'], [])
    except:
        pass
    return ([], ['Prerelease'])

def translate_to_gh_repo(recipe_name):
    try:
        devtool_out = subprocess.check_output(["bitbake", "-e"] + [recipe_name],
                                                universal_newlines=True, 
                                                stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        devtool_out = e.stdout or ""
    for m in re.finditer(r"SRC_URI\s*=\s*\"(?P<value>.*)\"", devtool_out, re.MULTILINE):
        for chunk in m.group("value").split(" "):
            match = re.match(r".*://github.com/(?P<repo>.*)", chunk)
            if match:
                _repo = re.sub(r"(.*)\.git$", r"\1", match.group("repo").split(";")[0])
                print("{} points to GH repo {}".format(recipe_name, _repo))
                return _repo
    return ""

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
        if l in _blacklist or not re.match(_args.filter, l) or l.startswith("nativesdk-"):
            continue
        print("Checking {}...".format(l), end='', flush=True)
        try:
            devtool_out = subprocess.check_output(["devtool", "check-upgrade-status"] + [l],
                                                   universal_newlines=True, 
                                                   stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            devtool_out = e.stdout or ""
        pattern = r"^(INFO:\s+)*(?P<recipe>[A-Za-z0-9\+\.\-_]+)\s+(?P<curversion>[A-Za-z0-9\.\-_]+)\s+(?P<nextversion>[A-Za-z0-9\.\-_]+)\s+.*"
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
    if _file:
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
    issue_list = repo.issues(state="open")
    issue_list_closed = repo.issues(state="closed")
    for up in updates:
        for _ in range(0, 3):
            try:
                if up[0] in _blacklist:
                    continue
                # 1. no issue open found -> Create one
                # 2. issue found -> alter title, remove staging label (if present)
                matches = [x for x in issue_list if re.match(UPDATE_REGEX.format(up[0]), x.title)]

                _label_add, _label_remove = check_gh_prerelease(login, translate_to_gh_repo(up[0]), up[1])

                _open_list = [x for x in issue_list if x.title == UPDATE_FORMAT.format(up[0], up[1])]
                # if exact issue text found -> continue
                if any(_open_list):
                    _labels = [str(x) for x in _open_list[0].original_labels]
                    _labels += _label_add
                    _labels = [x for x in _labels if x not in _label_remove]
                    if not _args.dryrun:
                        _open_list[0].edit(labels=_labels)
                    continue
                if any([x for x in issue_list_closed if x.title == UPDATE_FORMAT.format(up[0], up[1])]):
                    continue
                if any(matches):
                    _labels = [str(x) for x in matches[0].original_labels]  + ["Update Bot"]
                    _labels += _label_add
                    _labels = [x for x in _labels if x not in _label_remove]
                    print("Alter issue from {}:{} -> {}:{}".format(matches[0].title,
                          matches[0].original_labels,
                          UPDATE_FORMAT.format(up[0], up[1]),
                          _labels))
                    if not _args.dryrun:
                        matches[0].edit(title=UPDATE_FORMAT.format(up[0], up[1]), 
                                        labels=_labels)
                else:
                    print("Create new issue {}:{}".format(UPDATE_FORMAT.format(
                        up[0], up[1]), ["Package Update", "Update Bot"]))
                    _labels = ["Package Update", "Update Bot"] + _label_add
                    if not _args.dryrun:
                        repo.create_issue(title=UPDATE_FORMAT.format(up[0], up[1]), labels=_labels)
                break
            except (github3.exceptions.ForbiddenError):
                time.sleep(60)
            except (github3.exceptions.ConnectionError, github3.exceptions.ServerError):
                time.sleep(10)

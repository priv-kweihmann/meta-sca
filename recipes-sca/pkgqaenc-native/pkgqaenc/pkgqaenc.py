#!/usr/bin/env python3

# BSD 2-Clause License
#
# Copyright (c) 2020, Konrad Weihmann
# All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are met:
#
# * Redistributions of source code must retain the above copyright notice, this
#   list of conditions and the following disclaimer.
#
# * Redistributions in binary form must reproduce the above copyright notice,
#   this list of conditions and the following disclaimer in the documentation
#   and/or other materials provided with the distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
# AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
# IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
# FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
# DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
# CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
# OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
# OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

import argparse
import hashlib
import json
import os
import re
import stat

import magic


def warning(id, obj, msg):
    print("WARNING: [{}]: {}: {}".format(id, obj, msg))


def info(obj, msg):
    print("INFO: {}: {}".format(obj, msg))


def rel_path(root, obj, _args):
    return os.path.relpath(os.path.join(root, obj), os.path.dirname(_args.directory))


def rel_path_self(root, obj, _args):
    _tmp = os.path.relpath(root, _args.directory)
    if "/" not in _tmp:
        return ""
    return os.path.join(_tmp, obj)

def load_source_checksums(_args):
    res = {}
    with open(_args.config["sourceChecksum"]) as i:
        for line in i.readlines():
            _chunks = [x.strip("\n") for x in line.split(" ") if x]
            if len(_chunks) < 2:
                continue
            res[os.path.basename(_chunks[1])] = _chunks[0]
    return res

def file_md5(_file):
    res = hashlib.md5()
    with open(_file, "rb") as f:
        for chunk in iter(lambda: f.read(4096), b""):
            res.update(chunk)
    return res.hexdigest()

def create_parser():
    parser = argparse.ArgumentParser(description='Enhanced package-qa')
    parser.add_argument("--debug", default=False,
                        action="store_true", help="Debug output")
    parser.add_argument("config", help="Configuration file")
    parser.add_argument("directory", help="Directory to check")

    args = parser.parse_args()
    with open(args.config) as i:
        try:
            args.config = json.load(i)
        except json.JSONDecodeError:
            raise Exception("Configuration file isn't a valid json")
    return args


def walk_dir(_args):
    for root, dirs, files in os.walk(_args.directory):
        for d in dirs:
            if d in ["CONTROL"] or not rel_path_self(root, d, _args):
                continue
            if _args.debug:
                info(rel_path(root, d, _args), "Directory found")
            if _args.config["acceptableDirs"]:
                if not any([rel_path_self(root, d, _args).lstrip("/").startswith(x.lstrip("/")) for x in _args.config["acceptableDirs"]]):
                    warning("unacceptable-dir", rel_path(root, d, _args),
                            "Directory is not in acceptable paths")
            if any([rel_path_self(root, d, _args).lstrip("/").startswith(x.lstrip("/")) for x in _args.config["blacklistDirs"]]):
                warning("blacklist-dir", rel_path(root, d, _args),
                        "Directory is blacklisted")
            _maxItem = None
            _minItem = None
            _filemode = int(
                oct(stat.S_IMODE(os.stat(os.path.join(root, d)).st_mode)), 8) & 0x1ff
            if "inode/directory" in _args.config["maxMask"].keys():
                _maxItem = _args.config["maxMask"]["inode/directory"]
            elif "dir" in _args.config["maxMask"].keys():
                _maxItem = _args.config["maxMask"]["dir"]
            elif "default" in _args.config["maxMask"].keys():
                _maxItem = _args.config["maxMask"]["default"]
            if "inode/directory" in _args.config["minMask"].keys():
                _minItem = _args.config["minMask"]["inode/directory"]
            elif "dir" in _args.config["minMask"].keys():
                _minItem = _args.config["minMask"]["dir"]
            elif "default" in _args.config["minMask"].keys():
                _minItem = _args.config["minMask"]["default"]
            if _maxItem:
                _cmode = int(_maxItem, 8)
                if _filemode > _cmode:
                    warning("too-permissive", rel_path(root, d, _args),
                            "Too permissive filemode {}. Allowed maximum {}".format(oct(_filemode), oct(_cmode)))
            if _minItem:
                _cmode = int(_minItem, 8)
                if _filemode < _cmode:
                    warning("too-restrictive", rel_path(root, d, _args),
                            "Too resrictive filemode {}. Allowed minimum {}".format(oct(_filemode), oct(_cmode)))
        for f in files:
            _filename = os.path.join(root, f)
            if os.path.basename(os.path.dirname(_filename)) in ["CONTROL"]:
                continue
            try:
                _filemode = int(
                    oct(stat.S_IMODE(os.stat(_filename).st_mode)), 8) & 0x1ff
            except:
                _filemode = int(oct(777))
            _, _ext = os.path.splitext(_filename)
            _basename = os.path.basename(_filename)
            _script = False
            try:
                with open(_filename) as i:
                    _cnt = i.readline(1024)
                    if _cnt:
                        m = re.match(r"^#!(?P<shebang>/.*)$", _cnt)
                        if m:
                            _script = m.group("shebang").strip()
            except Exception:
                pass

            try:
                _mime = magic.from_file(_filename, mime=True)
            except magic.MagicException as e:
                print(e)
                _mime = "unknown/unknown"

            if _args.debug:
                info(rel_path(root, f, _args),
                     "mode: {}, mime: {}, ext: {}, script: '{}'".format(oct(_filemode), _mime, _ext, _script))
            _maxItem = None
            _minItem = None
            if _mime in _args.config["maxMask"].keys():
                _maxItem = _args.config["maxMask"][_mime]
            elif _ext in _args.config["maxMask"].keys():
                _maxItem = _args.config["maxMask"][_ext]
            elif _script != False and "script" in _args.config["maxMask"].keys():
                _maxItem = _args.config["maxMask"]["script"]
            elif "default" in _args.config["maxMask"].keys():
                _maxItem = _args.config["maxMask"]["default"]
            if _mime in _args.config["minMask"].keys():
                _minItem = _args.config["minMask"][_mime]
            elif _ext in _args.config["minMask"].keys():
                _minItem = _args.config["minMask"][_ext]
            elif _script != False and "script" in _args.config["minMask"].keys():
                _minItem = _args.config["minMask"]["script"]
            elif "default" in _args.config["minMask"].keys():
                _minItem = _args.config["minMask"]["default"]
            if _maxItem:
                _cmode = int(_maxItem, 8)
                if _filemode > _cmode:
                    warning("too-permissive", rel_path(root, f, _args),
                            "Too permissive filemode {}. Allowed maximum {}".format(oct(_filemode), oct(_cmode)))
            if _minItem:
                _cmode = int(_minItem, 8)
                if _filemode < _cmode:
                    warning("too-restrictive", rel_path(root, f, _args),
                            "Too resrictive filemode {}. Allowed minimum {}".format(oct(_filemode), oct(_cmode)))
            if _script != False and "script" in _args.config["execCheck"] or \
               _mime in _args.config["execCheck"] or \
               _basename in _args.config["execCheck"]:
                if (stat.S_IXUSR & _filemode) == 0:
                    warning("exec-check", rel_path(root, f, _args),
                            "File should be at least executable for its owner")
            if _script != False:
                if _script not in _args.config["acceptableShebang"]:
                    if _script in _args.config["blacklistShebang"]:
                        warning("blacklisted-shebang", rel_path(root, f, _args),
                            "shebang used {} is blacklisted".format(_script))
                    else:
                        info(rel_path(root, f, _args),
                            "shebang used {} isn't whitelisted".format(_script))

            if _basename in _args.config["nocopyCheck"] or \
               _ext in _args.config["nocopyCheck"] or \
               _mime in _args.config["nocopyCheck"]:
                if file_md5(_filename) in _args.config["__checksums"].values():
                    warning("direct-copy", rel_path(root, f, _args),
                            "File was directly copied from sources. That's not allowed by current configuration")

            if any([x in _args.config["whitelistFiles"] for x in [_mime, _ext, _basename]]):
                continue

            if any([x in _args.config["blacklistFiles"] for x in [_mime, _ext, _basename]]):
                warning("blacklisted-file", rel_path(root, f, _args),
                        "Blacklisted file mime:'{}' found".format(_mime))


if __name__ == '__main__':
    _args = create_parser()
    _args.config["__checksums"] = load_source_checksums(_args)
    walk_dir(_args)

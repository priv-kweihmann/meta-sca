import os
import json
import argparse
import copy
import re
import subprocess
import hashlib
import tarfile
import glob
from semantic_version import Version

TPL = """SUMMARY = "RubyGem: {name}"
DESCRIPTION = "{__info}"
HOMEPAGE = "{homepage_uri}"

LICENSE = "{__license}"
LIC_FILES_CHKSUM = "file://{__licfile};md5={__lichash}"

DEPENDS = "{__deps}"

SRC_URI[md5sum] = "{__md5sum}"
SRC_URI[sha256sum] = "{__sha256sum}"

GEM_NAME = "{name}"

inherit rubygemsnative
"""

__seen_pkgs = []

def get_description(args, pkgname):
    try:
        _output = subprocess.check_output(
                    ["curl", "-k", "https://rubygems.org/api/v1/gems/{}.json".format(pkgname)], 
                    universal_newlines=True, stderr=subprocess.DEVNULL)
    except subprocess.CalledProcessError as e:
        _output = "{}"
    try:
        res = json.loads(_output)
    except json.JSONDecodeError as e:
        print("Can't decode json -> {}".format(str(_output)))
        res = {}
    return res

def sanitize_pkgname(raw):
    return raw.replace("@", "").replace("/", "-").replace("_", "-")

def create_depends(desc):
    if not "dependencies" in desc:
        return ""
    if not "runtime" in desc["dependencies"]:
        return ""
    _tpl = "ruby-{}-native"
    res = [sanitize_pkgname(_tpl.format(k["name"])) for k in desc["dependencies"]["runtime"]]
    return " \\\n           ".join(sorted(res))

def get_best_version(desc, pkgname, version):
    return desc["version"]

def get_hashes(args, description, url):
    try:
        subprocess.check_call(["curl", "-k", url, "--output", "/tmp/rubygen.tmp"],
                              stderr=subprocess.DEVNULL, stdout=subprocess.DEVNULL)
        subprocess.check_call(["tar", "xf", "/tmp/rubygen.tmp", "-C", "/tmp"],
                              stderr=subprocess.DEVNULL, stdout=subprocess.DEVNULL) 
    except subprocess.CalledProcessError as e:
        print("Can't generate hashes for URL:{}".format(url))
        return ("", "", "TODO", "")

    _lic_hash = ""
    _lic_path = "TODO"
    
    hash_md5 = hashlib.md5()
    hash_sha256 = hashlib.sha256()
    with open("/tmp/rubygen.tmp", "rb") as f:
        for chunk in iter(lambda: f.read(4096), b""):
            hash_md5.update(chunk)
            hash_sha256.update(chunk)
    
    return (hash_md5.hexdigest(), hash_sha256.hexdigest(), os.path.basename(_lic_path), _lic_hash)

def get_license(desc):
    if "licenses" not in desc:
        return "Unlicense"
    if not desc["licenses"]:
        return "TODO"
    return " & ".join(desc["licenses"])

def check_existing(args, pkgname, version, _naming_pattern):
    _matches = glob.glob(os.path.join(args.basepath, _naming_pattern.format(sanitize_pkgname(pkgname), "*")))
    for m in _matches:
        mversion = Version(os.path.basename(m).replace(".bb", "").split("_")[1])
        cversion = Version(version)
        if mversion >= cversion:
            return False
        if mversion < cversion:
            print("Deleting old version {}".format(os.path.basename(m)))
            os.remove(m)
    return True

def create_tpl(args, pkgname, version):
    global __seen_pkgs
    _naming_pattern = "ruby-{}-native_{}.bb"
    if pkgname in __seen_pkgs:
        return
    _all_description = get_description(args, pkgname)
    try:
        _bestversion = get_best_version(_all_description, pkgname, version)
    except ValueError:
        print("Can't get useful version for {} with '{}'".format(pkgname, version))
        return
    if not check_existing(args, pkgname, _bestversion, _naming_pattern):
        return
    _description = _all_description
    _respath = os.path.join(args.basepath, _naming_pattern.format(sanitize_pkgname(pkgname), _bestversion))
    if _description:
        # compute a few things first
        __calculated = {
            "__deps": create_depends(_description),
            "__cleanname": sanitize_pkgname(pkgname),
            "__version": _bestversion,
            "__license": get_license(_description),
            "__disttarball": _description["gem_uri"],
            "__info": (_description["info"].split(". ")[0]).replace("\n", " ")
        }
        __calculated["__md5sum"], __calculated["__sha256sum"], __calculated["__licfile"], __calculated["__lichash"] = get_hashes(args, _description, __calculated["__disttarball"])
        __tpl = copy.deepcopy(TPL)
        for k, v in _description.items():
            __tpl = __tpl.replace("{{{}}}".format(k), str(v))
        for k, v in __calculated.items():
            __tpl = __tpl.replace("{{{}}}".format(k), str(v))
        
        if not os.path.exists(_respath):
            os.makedirs(os.path.dirname(_respath), exist_ok=True)
            with open(_respath, "w") as o:
                o.write(__tpl)
        
        __seen_pkgs.append(pkgname)

        if "dependencies" in _description and "runtime" in _description["dependencies"]:
            for item in _description["dependencies"]["runtime"]:
                create_tpl(args, item["name"], "1000.0")

def create_parser():
    parser = argparse.ArgumentParser(
        description='Ruby recipe generator')
    parser.add_argument("basepath", help="base path to the recipes")
    parser.add_argument("gemname", help="name of the gem package")
    parser.add_argument("gemversion", help="version of the gem package")
    return parser.parse_args()

def main():
    args = create_parser()
    create_tpl(args, args.gemname, args.gemversion)

if __name__ == '__main__':
    main()
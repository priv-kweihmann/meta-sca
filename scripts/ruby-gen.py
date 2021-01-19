import os
import json
import argparse
import copy
import re
import subprocess
import hashlib
import tarfile
import glob
from license_util import get_license_info
from recipe_util import check_depends
from semantic_version import Version

TPL = """SUMMARY = "RubyGem: {name}"
DESCRIPTION = "{__info}"
HOMEPAGE = "{homepage_uri}"

LICENSE = "{__license}"
LIC_FILES_CHKSUM = "file://{__licfile};md5={__lichash}"

DEPENDS += "{__deps}"
RDEPENDS_${PN} += "{__rdeps}"

SRC_URI[md5sum] = "{__md5sum}"
SRC_URI[sha256sum] = "{__sha256sum}"

GEM_NAME = "{name}"

{__class}
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

def create_depends(desc, old, generate):
    if generate:
        if not "dependencies" in desc:
            return ""
        if not "runtime" in desc["dependencies"]:
            return ""
        _tpl = "ruby-{}-native"
        res = [sanitize_pkgname(_tpl.format(k["name"])) for k in desc["dependencies"]["runtime"]]
    else:
        res = []
    res, _ = check_depends(res, [], old)
    return " \\\n                  ".join(sorted(res))

def create_rdepends(desc, old, generate):
    if generate:
        if not "dependencies" in desc:
            return ""
        if not "runtime" in desc["dependencies"]:
            return ""
        _tpl = "ruby-{}"
        res = [sanitize_pkgname(_tpl.format(k["name"])) for k in desc["dependencies"]["runtime"]]
    else:
        res = []
    _, res = check_depends([], res, old)
    return " \\\n                  ".join(sorted(res))

def get_best_version(desc, pkgname, version):
    return desc["version"]

def get_hashes(args, description, url):
    try:
        subprocess.check_call(["curl", "-k", url, "--output", "/tmp/rubygen.tmp"],
                              stderr=subprocess.DEVNULL, stdout=subprocess.DEVNULL)
    except subprocess.CalledProcessError as e:
        print("Can't generate hashes for URL:{}".format(url))
        return ("", "", "TODO", "abcdef")

    _lic_hash = ""
    _lic_path = "TODO"

    tar = tarfile.open("/tmp/rubygen.tmp", 'r')
    os.makedirs("/tmp/rubygen/", exist_ok=True)
    tar.extract("data.tar.gz", "/tmp/rubygen/")

    tar = tarfile.open("/tmp/rubygen/data.tar.gz", 'r')
    _lic_path, _lic_hash = get_license_info(tar, [r".*gemspec"])
    if not _lic_hash:
        print("Can't extract license for {}".format(description["name"]))
        _lic_hash = "abcdef"

    os.remove("/tmp/rubygen/data.tar.gz")
    
    hash_md5 = hashlib.md5()
    hash_sha256 = hashlib.sha256()
    with open("/tmp/rubygen.tmp", "rb") as f:
        for chunk in iter(lambda: f.read(4096), b""):
            hash_md5.update(chunk)
            hash_sha256.update(chunk)
    
    return (hash_md5.hexdigest(), hash_sha256.hexdigest(), _lic_path, _lic_hash)

def get_license(desc):
    if "licenses" not in desc:
        return "Unlicense"
    if not desc["licenses"]:
        return "TODO"
    return " & ".join(desc["licenses"])

def check_existing(args, pkgname, version, _naming_pattern):
    _matches = glob.glob(os.path.join(args.basepath, _naming_pattern.format(sanitize_pkgname(pkgname), "*")))
    if not _matches:
        return ["/tmp/does/not/exists"]
    res = []
    for m in _matches:
        try:
            mversion = Version(os.path.basename(m).replace(".bb", "").split("_")[1])
            cversion = Version(version)
        except ValueError:
            mversion = int(os.path.basename(m).replace(".bb", "").split("_")[1].replace(".", ""))
            cversion = int(version.replace(".", ""))
        if mversion >= cversion:
            print("{} <= {} @{}".format(mversion, cversion, os.path.basename(m)))
            return False
        if mversion < cversion:
            res.append(m)
    return res

def create_tpl(args, pkgname, version):
    global __seen_pkgs
    _naming_pattern = "ruby-{}-native_{}.bb"
    if args.target:
        _naming_pattern = "ruby-{}_{}.bb"
    if pkgname in __seen_pkgs:
        return
    _all_description = get_description(args, pkgname)
    try:
        _bestversion = get_best_version(_all_description, pkgname, version)
    except ValueError:
        print("Can't get useful version for {} with '{}'".format(pkgname, version))
        return
    _oldrecipes = check_existing(args, pkgname, _bestversion, _naming_pattern)
    if not _oldrecipes:
        print("Higher version already existing")
        return
    _description = _all_description
    _respath = os.path.join(args.basepath, _naming_pattern.format(sanitize_pkgname(pkgname), _bestversion))
    if _description:
        # compute a few things first
        __calculated = {
            "__class": ["rubygems"],
            "__deps": create_depends(_description, _oldrecipes, not args.target),
            "__rdeps": create_rdepends(_description, _oldrecipes, args.target),
            "__cleanname": sanitize_pkgname(pkgname),
            "__version": _bestversion,
            "__license": get_license(_description),
            "__disttarball": _description["gem_uri"],
            "__info": re.sub(r'\n|"', "", _description["info"].split(". ")[0]).strip()
        }
        for m in _oldrecipes:
            if not os.path.exists(m):
                continue
            print("Deleting old version {}".format(os.path.basename(m)))
            os.remove(m)
        if not args.target:
            __calculated["__class"] += ["native"]
        __calculated["__class"] = "\n".join(["inherit {}".format(x) for x in __calculated["__class"]])
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
    parser.add_argument("--target", default=False, action="store_true", help="Generate for target")
    return parser.parse_args()

def main():
    args = create_parser()
    create_tpl(args, args.gemname, args.gemversion)

if __name__ == '__main__':
    main()
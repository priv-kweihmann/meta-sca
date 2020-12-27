import os
import json
import argparse
import copy
import re
import subprocess
import hashlib
import tarfile
import glob
from semantic_version import Version, NpmSpec

TPL = """SUMMARY = "NPM: {name}"
DESCRIPTION = "{description}"
HOMEPAGE = "{homepage}"

LICENSE = "{__license}"
LIC_FILES_CHKSUM = "file://{__licfile};md5={__lichash}"

DEPENDS = "{__deps}"

SRC_URI = "{__disttarball}"
SRC_URI[md5sum] = "{__md5sum}"
SRC_URI[sha256sum] = "{__sha256sum}"

NPM_PKGNAME = "{name}"

inherit npmhelper
inherit native
"""

__seen_pkgs = []

def get_description(args, pkgname):
    try:
        _output = subprocess.check_output(
                    ["curl", "-k", "https://registry.npmjs.org/{}".format(pkgname)], 
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
    _tpl = "npm-{}-native"
    res = [sanitize_pkgname(_tpl.format(k)) for k,_ in desc["dependencies"].items() if sanitize_pkgname(_tpl.format(k)) != sanitize_pkgname(_tpl.format(desc["name"]))]
    return " \\\n           ".join(sorted(res))

def get_best_version(desc, pkgname, version):
    try:
        _available_versions = [Version(x) for x in desc["versions"].keys()]
        return str(NpmSpec(version).select(_available_versions))
    except:
        print("Can't find version for spec {}:'{}' - falling back to latest".format(pkgname, version))
        return str(NpmSpec("*").select(_available_versions))

def get_hashes(args, pkgname, url):
    try:
        subprocess.check_call(["curl", "-k", url, "--output", "/tmp/npmgen.tmp"],
                              stderr=subprocess.DEVNULL, stdout=subprocess.DEVNULL) 
    except subprocess.CalledProcessError as e:
        print("Can't generate hashes for URL:{}".format(url))
        return ("", "", "TODO", "")

    _lic_hash = ""
    _lic_path = "TODO"
    tar = tarfile.open("/tmp/npmgen.tmp", 'r:gz')
    _tarcnt = tar.getnames()
    _potential_files = [x for x in tar.getnames() if re.match(r"^(.*/)*(license.*|copying.*|licence.*)", x, re.IGNORECASE)]
    if _potential_files:
        try:
            _l = tar.extractfile(_potential_files[0])
            _lic_path = os.path.join("/tmp", os.path.basename(_potential_files[0]))
            with open(_lic_path, "wb") as o:
                o.write(_l.read())
            hash_md5 = hashlib.md5()
            with open(_lic_path, "rb") as f:
                for chunk in iter(lambda: f.read(4096), b""):
                    hash_md5.update(chunk)
            _lic_hash = hash_md5.hexdigest()
        except:
            _lic_path = "TODO"
            _lic_hash = ""
    if not _lic_hash:
        print("Can't extract license for {}".format(pkgname))
    
    hash_md5 = hashlib.md5()
    hash_sha256 = hashlib.sha256()
    with open("/tmp/npmgen.tmp", "rb") as f:
        for chunk in iter(lambda: f.read(4096), b""):
            hash_md5.update(chunk)
            hash_sha256.update(chunk)
    return (hash_md5.hexdigest(), hash_sha256.hexdigest(), os.path.basename(_lic_path), _lic_hash)

def get_license(desc):
    if "license" not in desc:
        return "Unlicense"
    _res = desc["license"]
    if isinstance(_res, dict):
        _res = _res["type"]
    _res = _res.lstrip("(").rstrip(")")
    for k,v in {" AND ": " & ", " OR ": " | "}.items():
        _res = _res.replace(k, v)
    return _res

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
    _naming_pattern = "npm-{}-native_{}.bb"
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
    _description = _all_description["versions"][_bestversion]
    _respath = os.path.join(args.basepath, _naming_pattern.format(sanitize_pkgname(pkgname), _bestversion))
    if _description:
        if not "dist" in _description:
            return
        if not "tarball" in _description["dist"]:
            return
        # compute a few things first
        __calculated = {
            "__deps": create_depends(_description),
            "__disttarball": _description["dist"]["tarball"],
            "__cleanname": sanitize_pkgname(pkgname),
            "__version": _bestversion,
            "__license": get_license(_description)
        }
        __calculated["__md5sum"], __calculated["__sha256sum"], __calculated["__licfile"], __calculated["__lichash"] = get_hashes(args, pkgname, __calculated["__disttarball"])
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

        if "dependencies" in _description:
            for k, v in _description["dependencies"].items():
                create_tpl(args, k, v)

def create_parser():
    parser = argparse.ArgumentParser(
        description='NPM recipe generator')
    parser.add_argument("basepath", help="base path to the recipes")
    parser.add_argument("npmname", help="name of the npm package")
    parser.add_argument("npmversion", help="version of the npm package")
    return parser.parse_args()

def main():
    args = create_parser()
    create_tpl(args, args.npmname, args.npmversion)

if __name__ == '__main__':
    main()
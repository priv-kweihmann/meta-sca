import argparse
import glob
import subprocess
import json
import re
import os
import sys
import hashlib

def create_parser():
    parser = argparse.ArgumentParser(
        description='CPAN update generator')
    parser.add_argument("basepath", help="base path to the recipes")
    parser.add_argument("recipename", help="name of the python package")
    parser.add_argument("version", help="version of the python package")
    return parser.parse_args()

def get_hashes(args, url):
    try:
        subprocess.check_call(["curl", "-k", url, "--output", "/tmp/perlgen.tmp"],
                              stderr=subprocess.DEVNULL, stdout=subprocess.DEVNULL)
    except subprocess.CalledProcessError as e:
        print("Can't generate hashes for URL:{}".format(url))
        return ("", "")
   
    hash_md5 = hashlib.md5()
    hash_sha256 = hashlib.sha256()
    with open("/tmp/perlgen.tmp", "rb") as f:
        for chunk in iter(lambda: f.read(4096), b""):
            hash_md5.update(chunk)
            hash_sha256.update(chunk)
    
    return (hash_md5.hexdigest(), hash_sha256.hexdigest())

def update_pkg(args):
    _matches = glob.glob("{base}/*/*/{pkg}_*.bb".format(base=args.basepath, pkg=args.recipename))
    if not _matches:
        print("No recipe found for {pkg}".format(pkg=args.recipename))
        return False
    
    _recipe_oldname = _matches[0]

    _tmp = _matches[0].rsplit("_", 1)
    _tmp[1] = "{version}.bb".format(version=args.version)

    _recipe_newname = "_".join(_tmp)

    _lines = []
    with open(_matches[0]) as r:
        _lines = r.readlines()

    _pkg = [x for x in _lines if x.startswith("SRC_URI =")]
    if not _pkg:
        print("Can't extract CPAN package name for {pkg}".format(pkg=args.recipename))
        return False

    _pkg = re.sub(r'\n|\s|"', "", _pkg[0].replace('SRC_URI = "', "")).strip()

    _updated = False

    _md5, _sha256 = get_hashes(args, _pkg.replace("${PV}", args.version))

    for index, value in enumerate(_lines):
        if value.startswith("SRC_URI[md5sum] ="):
            _lines[index] = 'SRC_URI[md5sum] = "{}"\n'.format(_md5)
        if value.startswith("SRC_URI[sha256sum] ="):
            _lines[index] = 'SRC_URI[sha256sum] = "{}"\n'.format(_sha256)
        _updated = True
    if not _updated:
        print("Version {version} doesn't exist or package name for {pkg}".format(version=args.version, pkg=args.recipename))
        return False

    with open(_recipe_newname, "w") as o:
        o.write("".join(_lines))
    
    os.remove(_recipe_oldname)
    return True

def main():
    args = create_parser()
    sys.exit(0 if update_pkg(args) else 1)

if __name__ == '__main__':
    main()
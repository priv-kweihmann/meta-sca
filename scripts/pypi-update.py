import argparse
import glob
import requests
import json
import re
import os
import sys

def create_parser():
    parser = argparse.ArgumentParser(
        description='PyPi update generator')
    parser.add_argument("basepath", help="base path to the recipes")
    parser.add_argument("recipename", help="name of the python package")
    parser.add_argument("version", help="version of the python package")
    return parser.parse_args()

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

    _pkg = [x for x in _lines if x.startswith("PYPI_PACKAGE =")]
    if not _pkg:
        print("Can't extract PyPi package name for {pkg}".format(pkg=args.recipename))
        return False

    _pkg = re.sub(r'\n|\s|"', "", _pkg[0].replace('PYPI_PACKAGE = "', "")).strip()

    res = requests.get("https://pypi.org/pypi/{pkg}/json".format(pkg=_pkg)).json()

    _updated = False

    if "releases" in res and args.version in res["releases"]:
        for item in res["releases"][args.version]:
            if not item["packagetype"] == "sdist":
                continue
            _md5 = item["digests"]["md5"]
            _sha256 = item["digests"]["sha256"]

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
    
    if _updated:
        os.remove(_recipe_oldname)
    return True

def main():
    args = create_parser()
    sys.exit(0 if update_pkg(args) else 1)

if __name__ == '__main__':
    main()
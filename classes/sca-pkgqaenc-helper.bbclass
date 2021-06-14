## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

def do_sca_pkgqaenc_warning(id, obj, msg):
    return "WARNING: [{}]: {}: {}\n".format(id, obj, msg)

def __do_sca_pkgqaenc_pkg_db_init(d):
    import os
    import glob
    import oe.packagedata

    _map = {}

    for item in glob.glob(os.path.join(d.getVar("PKGDATA_DIR"), "runtime", "*")):
        _package_name = os.path.basename(item)
        try:
            pkgdata = oe.packagedata.read_subpkgdata_dict(_package_name, d)

            _map[_package_name] = set()

            if "FILES_INFO" in pkgdata:
                file_list = pkgdata["FILES_INFO"]
                if isinstance(file_list, str):
                    import ast
                    file_list = ast.literal_eval(file_list)
                _map[_package_name].update(file_list.keys())
            for k, v in pkgdata.items():
                if k.startswith("FILERPROVIDES"):
                    _list = v
                    if isinstance(_list, str):
                        _list = _list.split(" ")
                    _map[_package_name].update(_list)
        except FileNotFoundError:
            pass
    return _map

def do_sca_pkgqaenc_get_pkg_executables(d, package, isexec=True):
    import os
    res = set()
    _basepath = d.expand("${{PKGDEST}}/{}".format(package))
    for root, dirs, files in os.walk(_basepath, topdown=True):
        for item in files:
            _filepath = os.path.join(root, item)
            if not os.path.isfile(_filepath):
                continue
            if os.access(_filepath, os.X_OK) or not isexec:
                res.add(_filepath.replace(_basepath, "", 1).lstrip("/"))
    return res

def do_sca_pkgqaenc_is_provided_by_self(d, file, package, isexec=True, suffix=""):
    import re
    _file_as_needle = re.escape(file)
    if not file.startswith("/"):
        _file_as_needle = ".*/" + _file_as_needle

    _file_as_needle += suffix
    _file_as_needle += "$"

    if any(re.match(_file_as_needle, x) for x in do_sca_pkgqaenc_get_pkg_executables(d, package, isexec=isexec)):
        return True
    return False

def do_sca_pkgqaenc_pkg_for_file(d, file, suffix=""):
    import re
    if not hasattr(do_sca_pkgqaenc_pkg_for_file, "map"):
        do_sca_pkgqaenc_pkg_for_file.map = __do_sca_pkgqaenc_pkg_db_init(d)

    _pkgs = set()

    _file_as_needle = re.escape(file)
    if not file.startswith("/"):
        _file_as_needle = ".*/" + _file_as_needle

    _file_as_needle += suffix
    _file_as_needle += "$"

    for k,v in do_sca_pkgqaenc_pkg_for_file.map.items():
        if any(re.match(_file_as_needle, x) for x in v):
            _pkgs.add(k)

    return _pkgs
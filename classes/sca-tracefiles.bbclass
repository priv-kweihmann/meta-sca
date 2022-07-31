## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

# Valid modes are
# full - takes all sources files
# loose - takes all sources files end up being installed + any files matching SCA_TRACEFILES_LOOSE_INC
# strict - takes all sources files end up being installed
SCA_TRACEFILES_MODE ?= "full"
SCA_TRACEFILES_LIST ?= "${T}/sca_sources.txt"
# file extensions addionally consider in loose mode
SCA_TRACEFILES_LOOSE_INC ?= ".h .hpp"
# Packages to scan
SCA_TRACEFILES_PKGS ?= "${PACKAGES}"

inherit sca-global
inherit sca-helper

def sca_get_pkg_files(d):
    import os

    cwd = os.getcwd()
    os.chdir(d.getVar("D"))

    _result = {}
    _valid_packages = d.expand("${SCA_TRACEFILES_PKGS}").split(" ")
    for x in d.expand("${PACKAGES}").split(" "):
        _pattern = set()
        _seen = set()
        if not x:
            continue
        _x = d.getVar("FILES:{}".format(x))
        if not _x:
            continue
        for y in _x.split(" "):
            if not y:
                continue
            if os.path.isabs(y) and os.path.isdir(os.path.join(os.getcwd(), y.lstrip("/"))):
                y += '*'
            _tmp = get_files_by_glob(d, os.getcwd(), y)
            if x in _valid_packages:
                _pattern.update([x for x in _tmp if x not in _seen])
            _seen.update(_tmp)
        _result[x] = [x.lstrip(".") for x in _pattern]
    os.chdir(cwd)
    return _result

def sca_get_trace_files(d):
    import subprocess

    _mode = d.getVar("SCA_TRACEFILES_MODE")
    _res = {}
    _pkg_files = sca_get_pkg_files(d)
    for k, v in _pkg_files.items():
        try:
            cmd_out = subprocess.check_output(["tracefiles", d.getVar("D"), d.getVar("SCA_SOURCES_DIR")] + v)
        except subprocess.CalledProcessError as e:
            cmd_out = e.output or ""

        if not isinstance(cmd_out, str):
            cmd_out = cmd_out.decode('utf-8')

        _res[k] = set([x for x in cmd_out.split("\n") if x])
        _res[k].update(v)
        if _mode == "loose":
            # in loose mode include all files that are specified by include filter
            _res[k].update(get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_TRACEFILES_LOOSE_INC")))
    # In full mode add all sources to base package
    if _mode == "full":
        _pn = d.getVar("PN")
        if not _pn in _res:
            _res[_pn] = set()
        _res[_pn].update(get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), []))
        
    # strip SCA_SOURCES_DIR prefix
    for k,v in _res.items():
        _res[k] = [x.replace(d.getVar("SCA_SOURCES_DIR"), "", 1).replace(d.getVar("D"), "", 1).lstrip("/") for x in v]
    return _res

python do_sca_tracefiles() {
    import json
    with open(d.expand("${SCA_TRACEFILES_LIST}"), "w") as o:
        json.dump(sca_get_trace_files(d), o)
}

do_sca_tracefiles[nosdkgen] = "1"
addtask do_sca_tracefiles after do_install before do_package

DEPENDS += "tracefiles-native"

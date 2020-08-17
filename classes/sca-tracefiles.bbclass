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
# Only consider installed files from these packages
SCA_TRACEFILES_PKGS ?= "${PN}-lib ${PN}-bin ${PN}"

inherit sca-global
inherit sca-helper

def sca_get_pkg_files(d):
    import os

    cwd = os.getcwd()
    os.chdir(d.getVar("D"))

    _pattern = set()
    _seen = set()
    _valid_packages = d.expand("${SCA_TRACEFILES_PKGS}").split(" ")
    for x in d.expand("${PACKAGES}").split(" "):
        if not x:
            continue
        _x = d.getVar("FILES_{}".format(x))
        if not _x:
            continue
        for y in _x.split(" "):
            if not y:
                continue
            if os.path.isabs(y):
                y = '*' + y
            _tmp = get_files_by_glob(d, os.getcwd(), y)
            if x in _valid_packages:
                _pattern.update([x for x in _tmp if x not in _seen])
            _seen.update(_tmp)
    os.chdir(cwd)
    return [x.lstrip(".") for x in _pattern]

def sca_get_trace_files(d):
    import subprocess

    _mode = d.getVar("SCA_TRACEFILES_MODE")
    _res = set()
    if _mode in ["strict", "loose"]:
        _pkg_files = sca_get_pkg_files(d)
        if _pkg_files:
            try:
                cmd_out = subprocess.check_output(["tracefiles", d.getVar("D"), d.getVar("SCA_SOURCES_DIR")] + _pkg_files)
            except subprocess.CalledProcessError as e:
                cmd_out = e.output or ""

            if not isinstance(cmd_out, str):
                cmd_out = cmd_out.decode('utf-8')

            _res.update([x for x in cmd_out.split("\n") if x])
        if _mode == "loose":
            # in loose mode include all files that are specified by include filter
            _res.update(get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), d.getVar("SCA_TRACEFILES_LOOSE_INC")))
    else:
        # in other modes than loose or strict we return all files
        _res.update(get_files_by_extention(d, d.getVar("SCA_SOURCES_DIR"), []))
    # strip SCA_SOURCES_DIR prefix
    _res = [x.replace(d.getVar("SCA_SOURCES_DIR"), "", 1).lstrip("/") for x in _res]
    return _res

python do_sca_tracefiles() {
    with open(d.expand("${SCA_TRACEFILES_LIST}"), "w") as o:
        o.write("\n".join(sca_get_trace_files(d)))
}

addtask do_sca_tracefiles after do_install before do_package

DEPENDS += "tracefiles-native"

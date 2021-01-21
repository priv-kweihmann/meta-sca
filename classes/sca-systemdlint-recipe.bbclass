## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

SCA_SYSTEMDLINT_EXTRA_ARGS ?= "--norootfs"

inherit sca-systemdlint-core

def sca_systemd_version(d):
    import oe.packagedata
    import os

    try:
        files = os.listdir(d.getVar("PKGDATA_DIR") or "/does/not/exist")
    except OSError:
        # avoid a warning from oe.packagedata.pkgmap function
        # and simply return nothing instead
        bb.debug(1, "Can't determine systemd version, assuming latest")
        return ""

    pkgmap = oe.packagedata.pkgmap(d)
    for k,v in pkgmap.items():
        if "libsystemd" in k:
            try:
                pkgdata = oe.packagedata.read_subpkgdata_dict(k, d)
                _pv = "{0:.2f}".format(int(pkgdata["PV"].split(".")[0]) / 100.0)
                return _pv
            except:
                pass
    bb.debug(1, "Can't determine systemd version, assuming latest")
    return ""

# Needs to be overridden to make it work here
SCA_SYSTEMDLINT_SOURCES_DIR = "${D}"
SCA_SYSTEMDLINT_SYSTEMD_VERSION = "${@sca_systemd_version(d)}"

addtask do_sca_systemdlint after do_install before do_sca_deploy

DEPENDS += "sca-recipe-systemdlint-rules-native"

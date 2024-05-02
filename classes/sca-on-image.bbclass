## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Configuration for static code analysis on image-level

inherit sca-global
inherit sca-helper
inherit sca-file-filter
inherit sca-blocklist
inherit sca-deploy-image

SCA_PACKAGE_LICENSE_FILTER = "CLOSED"
SCA_ENABLED_MODULES_IMAGE ?= "\
                            bandit \
                            bashate \
                            bitbake \
                            checkbashism \
                            detectsecrets \
                            flake8 \
                            jsonlint \
                            multimetric \
                            mypy \
                            oelint \
                            pylint \
                            ruff \
                            shellcheck \
                            slick \
                            stank \
                            systemdlint \
                            tlv \
                            vulture \
                            xmllint \
                            yamllint \
                            "
SCA_SOURCES_DIR ?= "${IMAGE_ROOTFS}"

SCA_MODE = "image"
SCA_MODE_UPPER = "${@d.getVar('SCA_MODE').upper()}"
SCA_ACTIVE_MODULES = ""

def sca_on_image_init(d):
    import bb
    from bb.parse.parse_py import BBHandler
    enabledModules = []
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        if not sca_module_applicable(d, item):
            continue
        try:
            if sca_is_module_blocklisted(d, item):
                continue
            BBHandler.inherit("sca-{}-image".format(item), "sca-on-image", 1, d)
            func = "sca-{}-init".format(item).replace("-", "_")
            if d.getVar(func, False) is not None:
                bb.build.exec_func(func, d)
            okay = True
            enabledModules.append(item)
        except bb.parse.ParseError as exp:
            if d.getVar("SCA_VERBOSE_OUTPUT") != "0":
                sca_log_note(d, str(exp))
    if any(enabledModules):
        if d.getVar("SCA_VERBOSE_OUTPUT") == "1":
            bb.note("Using SCA Module(s) {}".format(",".join(sorted(enabledModules))))
        ## inherit license-helper class
        BBHandler.inherit("sca-license-image-helper".format(item), "sca-on-image", 1, d)
    d.appendVar("SCA_ACTIVE_MODULES", " " + " ".join(sorted(enabledModules)))

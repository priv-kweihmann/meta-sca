SUMMARY = "PO files linter to ease development and improve quality"
DESCRIPTION = "Dennis is a set of utilities for working with PO files to ease development and improve quality"
HOMEPAGE = "https://github.com/mozilla/dennis"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18944f15ca204949de2ab6f33ce1065"

DEPENDS += "\
            python3-click-native \
            python3-native \
            python3-polib-native \
           "

SRC_URI[md5sum] = "a78cbb0044549d63c97f864fafff0e9f"
SRC_URI[sha256sum] = "07381af4e0c16340186446313ad72937a6188b68022e5961f1a35da67e4d3610"

PYPI_PACKAGE = "dennis"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "dennis"

do_install:append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}

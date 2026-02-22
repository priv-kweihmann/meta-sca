SUMMARY = "PO files linter to ease development and improve quality"
DESCRIPTION = "Dennis is a set of utilities for working with PO files to ease development and improve quality"
HOMEPAGE = "https://github.com/mozilla/dennis"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18944f15ca204949de2ab6f33ce1065"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-click \
    nativesdk-python3-polib \
"

SRC_URI[md5sum] = "42087b04214731b47fd83144f9cbde5d"
SRC_URI[sha256sum] = "826d447ed9b3d3c9dec0d550a8647a90dfc8932ac5b8a1a619a0c30c7d63d79b"

PYPI_PACKAGE = "dennis"

inherit pypi
inherit sca-description
inherit setuptools3
inherit_defer nativesdk

SCA_TOOL_DESCRIPTION = "dennis"

do_install:append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-click \
    nativesdk-python3-core \
    nativesdk-python3-html \
    nativesdk-python3-netclient \
    nativesdk-python3-polib \
    nativesdk-python3-stringold \
"

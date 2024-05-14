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

SRC_URI[md5sum] = "6abdfb91b2c49cedcc542489305bbb11"
SRC_URI[sha256sum] = "8cfa89acbee5acd3e70714fbc45d9dc23446a2418624c17b1dcfdf0bdd33bbe0"

PYPI_PACKAGE = "dennis"

inherit pypi
inherit sca-description
inherit setuptools3
inherit_defer native

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

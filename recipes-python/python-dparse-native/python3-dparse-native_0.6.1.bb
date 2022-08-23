SUMMARY = "A parser for Python dependency files"
HOMEPAGE = "https://github.com/pyupio/dparse"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9563caded03dbd1b6016d79712dbe333"

DEPENDS += "\
            python3-packaging-native \
            python3-pyyaml-native \
            python3-six-native \
           "

PYPI_PACKAGE = "dparse2"

SRC_URI[sha256sum] = "fbafb839c3dc83040012af2602a00ca4e4b1693a9b1988492150466afa59dd26"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-packaging \
    nativesdk-python3-pyyaml \
    nativesdk-python3-six \
"

SUMMARY = "Python PE parsing module"
HOMEPAGE = "https://github.com/erocarrera/pefile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef2c924be9d0c8d6cf82374769748bfa"

DEPENDS += "\
            python3-future-native \
           "

PYPI_PACKAGE = "pefile"

SRC_URI[md5sum] = "3124186a88faf518a8e5243787bde669"
SRC_URI[sha256sum] = "ed79b2353daa58421459abf4d685953bde0adf9f6e188944f97ba9795f100246"

inherit pypi
inherit setuptools3
inherit native

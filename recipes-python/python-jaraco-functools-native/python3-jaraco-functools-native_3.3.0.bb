SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-more-itertools-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "jaraco.functools"

SRC_URI[md5sum] = "253de2c7300904096f73b91cd5705ca1"
SRC_URI[sha256sum] = "bfcf7da71e2a0e980189b0744b59dba6c1dcf66dcd7a30f8a4413e478046b314"

inherit pypi
inherit setuptools3
inherit native

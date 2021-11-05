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

SRC_URI[md5sum] = "6131d3bb387b426ff71e7b54515586c7"
SRC_URI[sha256sum] = "659a64743047d00c6ae2a2aa60573c62cfc0b4b70eaa14fa50c80360ada32aa8"

inherit pypi
inherit setuptools3
inherit native

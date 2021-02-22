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

SRC_URI[md5sum] = "7cf207f4f53d9d03daca15359b1455f9"
SRC_URI[sha256sum] = "97cf88b46ab544c266e2d81fa17bb183622268722a7dd1a3711ea426e9c26f94"

inherit pypi
inherit setuptools3
inherit native

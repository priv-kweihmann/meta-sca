SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-more-itertools-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "jaraco.functools"

SRC_URI[md5sum] = "4577c96918dffc0c61ad9ce18edfb13d"
SRC_URI[sha256sum] = "31e0e93d1027592b7b0bec6ad468db850338981ebee76ba5e212e235f4c7dda0"

inherit pypi
inherit setuptools3
inherit native

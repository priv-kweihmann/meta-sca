SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0699983c8f8199c37bee38509aacbbc6"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "ea319913e9f1142a49cd0ef574d43313"
SRC_URI[sha256sum] = "6b3218b2dde8ac5959c6476cde8f41a79e823c22feb656be2710cd2a3232cef9"

inherit pypi
inherit setuptools3
inherit native

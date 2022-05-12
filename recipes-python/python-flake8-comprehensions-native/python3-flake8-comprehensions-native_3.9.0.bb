SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd54c94e040946267bc2300dbc7d7e6d"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "d9f73758d97ef441db085bf3dd1aff44"
SRC_URI[sha256sum] = "20c2f6846090e8f265e757f0aa500614c88b0f9ffb0d954d330dcd8abd8f874e"

inherit pypi
inherit setuptools3
inherit native

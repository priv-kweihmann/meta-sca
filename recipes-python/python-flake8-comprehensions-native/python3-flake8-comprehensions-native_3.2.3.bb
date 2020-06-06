SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb874cc5b992b19a059b9b3ab8676f07"

DEPENDS += "${PYTHON_PN}-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "006f2755c522285e8031e399e88c417a"
SRC_URI[sha256sum] = "d5751acc0f7364794c71d06f113f4686d6e2e26146a50fa93130b9f200fe160d"

inherit pypi
inherit native
inherit setuptools3

SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0699983c8f8199c37bee38509aacbbc6"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "958b674934801da5bd667f982ab97203"
SRC_URI[sha256sum] = "c00039be9f3959a26a98da3024f0fe809859bf1753ccb90e228cc40f3ac31ca7"

inherit pypi
inherit setuptools3
inherit native

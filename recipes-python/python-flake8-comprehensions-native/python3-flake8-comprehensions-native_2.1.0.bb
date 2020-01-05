SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a2ffe95b77d9e226b7fc64f9b29eee4e"

PYPI_PACKAGE = "flake8-comprehensions"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "06a12690c756bda3513ce4200dd0b4b2"
SRC_URI[sha256sum] = "f0b61d983d608790abf3664830d68efd3412265c2d10f6a4ba1a353274dbeb64"

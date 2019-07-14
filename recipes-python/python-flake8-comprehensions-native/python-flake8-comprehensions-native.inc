SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
DESCRIPTION = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a2ffe95b77d9e226b7fc64f9b29eee4e"

PYPI_PACKAGE = "flake8-comprehensions"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native

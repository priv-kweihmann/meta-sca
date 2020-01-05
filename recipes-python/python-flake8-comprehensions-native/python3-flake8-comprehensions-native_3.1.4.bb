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

SRC_URI[md5sum] = "887af493107501ee7722eefd85032b4b"
SRC_URI[sha256sum] = "e3a8350a35d7bc71f8a1f64cf3c633a418a26b0edace2219d26ea4dd78ac21f3"

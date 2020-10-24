SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e92a537b134e72e9a5eec07b9b122236"

DEPENDS += "${PYTHON_PN}-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "104a99c83a9c347ada80d5c9c7f5be84"
SRC_URI[sha256sum] = "355ef47288523cad7977cb9c1bc81b71c82b7091e425cd9fbcd7e5c19a613677"

inherit pypi
inherit native
inherit setuptools3

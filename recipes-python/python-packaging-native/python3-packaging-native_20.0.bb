SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

PYPI_PACKAGE = "packaging"

DEPENDS += "${PYTHON_PN}-six-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "93d6ccbdfcb5b7697b6ecea53ecc294b"
SRC_URI[sha256sum] = "fe1d8331dfa7cc0a883b49d75fc76380b2ab2734b220fbb87d774e4fd4b851f8"

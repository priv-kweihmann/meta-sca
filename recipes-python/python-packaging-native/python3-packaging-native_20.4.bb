SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

DEPENDS += "${PYTHON_PN}-six-native"

PYPI_PACKAGE = "packaging"

SRC_URI[md5sum] = "3208229da731c5d8e29d4d8941e75005"
SRC_URI[sha256sum] = "4357f74f47b9c12db93624a82154e9b120fa8293699949152b22065d556079f8"

inherit pypi
inherit native
inherit setuptools3

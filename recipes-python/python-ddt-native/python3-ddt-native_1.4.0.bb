
SUMMARY = "Data-Driven Tests for Python Unittest"
HOMEPAGE = "https://github.com/datadriventests/ddt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=31d3abdb5983f06c0f7c19f4b9f61830"

DEPENDS += "python3-nose-native"

PYPI_PACKAGE = "ddt"

SRC_URI[md5sum] = "a1b401c8cbb76d1828f8a5b234a74e23"
SRC_URI[sha256sum] = "8847cc4f6437f1b77997fa9fddea673a5a2183fd9620fd33466a8e2b458c706c"

inherit pypi
inherit setuptools3
inherit native

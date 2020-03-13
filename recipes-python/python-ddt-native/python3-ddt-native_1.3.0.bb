
SUMMARY = "Data-Driven Tests for Python Unittest"
DESCRIPTION = "Data-Driven Tests for Python Unittest"
HOMEPAGE = "https://github.com/datadriventests/ddt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=31d3abdb5983f06c0f7c19f4b9f61830"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "ddt"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "de4371128c96023db4a1649ea69b5c71"
SRC_URI[sha256sum] = "8b83424766eea4d9ce25c8303bceba41a5678098dcf2d189b22b09a6685ff2f4"

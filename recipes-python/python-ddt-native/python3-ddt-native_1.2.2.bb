
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

SRC_URI[md5sum] = "44c4b4b5d7c2e61a045f0653216a5ec9"
SRC_URI[sha256sum] = "9f79cf234064cf9b43492b72da35c473de3f03163d37bd13cec5bd8d200dda6b"

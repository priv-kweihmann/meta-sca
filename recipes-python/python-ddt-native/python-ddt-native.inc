SUMMARY = "Data-Driven Tests for Python Unittest"
DESCRIPTION = "Data-Driven Tests for Python Unittest"
HOMEPAGE = "https://github.com/datadriventests/ddt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=31d3abdb5983f06c0f7c19f4b9f61830"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "ddt"

inherit pypi

FILES_${PN} += "${datadir}/ddt"

inherit native

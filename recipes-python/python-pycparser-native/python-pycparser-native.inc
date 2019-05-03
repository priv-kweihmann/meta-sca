SUMMARY = "C parser in Python."
DESCRIPTION = "C parser in Python."
HOMEPAGE = "https://github.com/eliben/pycparser"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86f1cedb4e6410a88ce8e30b91079169"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pycparser"

inherit pypi

inherit native

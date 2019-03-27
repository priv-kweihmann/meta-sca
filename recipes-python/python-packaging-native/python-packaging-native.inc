SUMMARY = "Core utilities for Python packages "
DESCRIPTION = "Core utilities for Python packages "
HOMEPAGE = "https://github.com/pypa/packaging"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

PYPI_PACKAGE = "packaging"

DEPENDS += "${PYTHON_PN}-six"

inherit pypi

FILES_${PN} += "${datadir}/packaging"

inherit native

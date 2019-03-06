SUMMARY = "lazy-object-proxy"
DESCRIPTION = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec680df42d8ad56427a83308817658cc"

RDEPENDS_${PN} += "${PYTHON_PN}-native"
PYPI_PACKAGE = "lazy-object-proxy"

inherit pypi

FILES_${PN} += "${datadir}/lazy-object-proxy"

inherit native

SUMMARY = "Merge a series of JSON documents."
DESCRIPTION = "Merge a series of JSON documents."
HOMEPAGE = "https://github.com/eliben/pyelftools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fad5eedb545d358ca87e878d399293f1"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "jsonmerge"

inherit pypi

FILES_${PN} += "${datadir}/jsonmerge"

inherit native

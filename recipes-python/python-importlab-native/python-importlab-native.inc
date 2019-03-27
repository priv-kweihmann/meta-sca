SUMMARY = "A library to calculate python dependency graphs."
DESCRIPTION = "A library to calculate python dependency graphs."
HOMEPAGE = "https://github.com/google/importlab"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

PYPI_PACKAGE = "importlab"

DEPENDS += "${PYTHON_PN}-networkx-native ${PYTHON_PN}-six-native"

inherit pypi

FILES_${PN} += "${datadir}/importlab"

inherit native

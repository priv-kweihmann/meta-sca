SUMMARY = "Manage dynamic plugins for Python applications"
DESCRIPTION = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-pbr-native"

PYPI_PACKAGE = "stevedore"

inherit pypi

FILES_${PN} += "${datadir}/stevedore"

inherit native

SUMMARY = "Manage dynamic plugins for Python applications"
DESCRIPTION = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-pbr-native"

PYPI_PACKAGE = "stevedore"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "f854d6ed0f6fcaf93a32c755d706ce19"
SRC_URI[sha256sum] = "18afaf1d623af5950cc0f7e75e70f917784c73b652a34a12d90b309451b5500b"

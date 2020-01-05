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

SRC_URI[md5sum] = "02c747c39f4634465aa2590ceefddf59"
SRC_URI[sha256sum] = "7be098ff53d87f23d798a7ce7ae5c31f094f3deb92ba18059b1aeb1ca9fec0a0"

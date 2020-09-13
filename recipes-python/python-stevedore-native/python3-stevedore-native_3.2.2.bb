SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "${PYTHON_PN}-pbr-native"

PYPI_PACKAGE = "stevedore"

SRC_URI[md5sum] = "c78357a02888490ef27a0d898eb97172"
SRC_URI[sha256sum] = "f845868b3a3a77a2489d226568abe7328b5c2d4f6a011cc759dfa99144a521f0"

inherit pypi
inherit setuptools3
inherit native

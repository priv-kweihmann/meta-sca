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

SRC_URI[md5sum] = "42fa2bf0251c96b543765c5ce13f37c9"
SRC_URI[sha256sum] = "e0739f9739a681c7a1fda76a102b65295e96a144ccdb552f2ae03c5f0abe8a14"

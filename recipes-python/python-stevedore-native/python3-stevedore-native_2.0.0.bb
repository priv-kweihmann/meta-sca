SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "${PYTHON_PN}-pbr-native"

PYPI_PACKAGE = "stevedore"

SRC_URI[md5sum] = "fb5e335752cce96d8ace289fed952f00"
SRC_URI[sha256sum] = "001e90cd704be6470d46cc9076434e2d0d566c1379187e7013eb296d3a6032d9"

inherit pypi
inherit setuptools3
inherit native

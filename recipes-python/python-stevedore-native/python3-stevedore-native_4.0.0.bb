SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "python3-pbr-native"

PYPI_PACKAGE = "stevedore"

SRC_URI[md5sum] = "935eac0b4f7d9af760abbb2d879b455f"
SRC_URI[sha256sum] = "f82cc99a1ff552310d19c379827c2c64dd9f85a38bcd5559db2470161867b786"

inherit pypi
inherit setuptools3
inherit native

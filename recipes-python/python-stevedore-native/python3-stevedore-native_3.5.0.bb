SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "python3-pbr-native"

PYPI_PACKAGE = "stevedore"

SRC_URI[md5sum] = "88d0d9dec369361ef127bbfbb6fbede2"
SRC_URI[sha256sum] = "f40253887d8712eaa2bb0ea3830374416736dc8ec0e22f5a65092c1174c44335"

inherit pypi
inherit setuptools3
inherit native

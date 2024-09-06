SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "06361b83d178fb62dcd1b4ba9a9b418c"
SRC_URI[sha256sum] = "788183e382e3d1d7707db08978239965e8b9e4e5ed42669bf4758186734d5f24"

inherit pypi
inherit setuptools3
inherit_defer native

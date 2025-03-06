SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "fbfd232f805fb892964b1050f14b5d96"
SRC_URI[sha256sum] = "93ea72ce6989eb2eed99d0f75721474f69ad88128afdef5ac377eb797c4bf76b"

inherit pypi
inherit setuptools3
inherit_defer native

SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "0aa2402d3549d04d35db6204591a225c"
SRC_URI[sha256sum] = "4651ca1445e80f2781827305de3d76b3ce53195f2227762684eb08f17bc473b7"

inherit pypi
inherit setuptools3
inherit native

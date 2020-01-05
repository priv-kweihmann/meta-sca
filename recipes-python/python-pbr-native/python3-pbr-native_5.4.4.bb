SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pbr"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "65cdc32e1a1ff56d481fc15aa8caf988"
SRC_URI[sha256sum] = "139d2625547dbfa5fb0b81daebb39601c478c21956dc57e2e07b74450a8c506b"

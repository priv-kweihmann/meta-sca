SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pbr"

inherit pypi
inherit native

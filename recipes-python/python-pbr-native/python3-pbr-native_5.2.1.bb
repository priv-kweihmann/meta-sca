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

SRC_URI[md5sum] = "f72c2dd10602abad3695097d634e94bb"
SRC_URI[sha256sum] = "93d2dc6ee0c9af4dbc70bc1251d0e545a9910ca8863774761f92716dece400b6"

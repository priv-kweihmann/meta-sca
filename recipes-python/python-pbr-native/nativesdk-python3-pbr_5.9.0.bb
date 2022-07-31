SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "d3f10f44608c7fee213a6ee322c6966c"
SRC_URI[sha256sum] = "e8dca2f4b43560edef58813969f52a56cef023146cbb8931626db80e6c1c4308"

inherit pypi
inherit setuptools3
inherit nativesdk

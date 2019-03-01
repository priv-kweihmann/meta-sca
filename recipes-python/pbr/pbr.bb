SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PV = "5.1.3"

SRC_URI[md5sum] = "08972dca5fd2a959f27842090973edd6"
SRC_URI[sha256sum] = "8c361cc353d988e4f5b998555c88098b9d5964c2e11acf7b0d21925a66bb5824"

DEPENDS += "python3-native"

PYPI_PACKAGE = "pbr"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/pbr"

BBCLASSEXTEND = "native nativesdk"

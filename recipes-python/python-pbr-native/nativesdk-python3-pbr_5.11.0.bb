SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "99ef94dbe5a00054fdcbbaa87268c3cd"
SRC_URI[sha256sum] = "b97bc6695b2aff02144133c2e7399d5885223d42b7912ffaec2ca3898e673bfe"

inherit pypi
inherit setuptools3
inherit nativesdk

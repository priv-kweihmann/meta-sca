SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "e01bcc0e9154d513ecad3e766f9582d7"
SRC_URI[sha256sum] = "d1377122a5a00e2f940ee482999518efe16d745d423a670c27773dfbc3c9a7d9"

inherit pypi
inherit setuptools3
inherit_defer native

SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "13a2fc5567ab7ddbb8a9d2bb356aa356"
SRC_URI[sha256sum] = "cfcc4ff8e698256fc17ea3ff796478b050852585aa5bae79ecd05b2ab7b39b9a"

inherit pypi
inherit setuptools3
inherit native

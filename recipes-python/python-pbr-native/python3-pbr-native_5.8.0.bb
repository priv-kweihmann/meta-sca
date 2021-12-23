SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "81e5812cd7a49afcea0094332eaa3f14"
SRC_URI[sha256sum] = "672d8ebee84921862110f23fcec2acea191ef58543d34dfe9ef3d9f13c31cddf"

inherit pypi
inherit setuptools3
inherit native

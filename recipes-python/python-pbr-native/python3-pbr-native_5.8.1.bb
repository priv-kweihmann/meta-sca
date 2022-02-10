SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "9ab99a85202af94990ef44ebcd2bf196"
SRC_URI[sha256sum] = "66bc5a34912f408bb3925bf21231cb6f59206267b7f63f3503ef865c1a292e25"

inherit pypi
inherit setuptools3
inherit native

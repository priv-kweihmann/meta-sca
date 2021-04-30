SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "62565acc6bf3e7e10b082463421f8b46"
SRC_URI[sha256sum] = "42df03e7797b796625b1029c0400279c7c34fd7df24a7d7818a1abb5b38710dd"

inherit pypi
inherit setuptools3
inherit native

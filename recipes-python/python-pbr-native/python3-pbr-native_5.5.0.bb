SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "743160fbfe66d1f38a063bf29a0e1da2"
SRC_URI[sha256sum] = "14bfd98f51c78a3dd22a1ef45cf194ad79eee4a19e8e1a0d5c7f8e81ffe182ea"

inherit pypi
inherit native
inherit setuptools3

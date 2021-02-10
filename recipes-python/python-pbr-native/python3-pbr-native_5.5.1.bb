SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "27efddb72a52f71b3d8993b60716223e"
SRC_URI[sha256sum] = "5fad80b613c402d5b7df7bd84812548b2a61e9977387a80a5fc5c396492b13c9"

inherit pypi
inherit setuptools3
inherit native

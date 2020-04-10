SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

PYPI_PACKAGE = "pbr"

SRC_URI[md5sum] = "7babe93c1a0e7f33ed6ee3b8a3f317f5"
SRC_URI[sha256sum] = "07f558fece33b05caf857474a366dfcc00562bca13dd8b47b2b3e22d9f9bf55c"

inherit pypi
inherit native
inherit setuptools3

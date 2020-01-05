SUMMARY = "Removes commented-out code"
DESCRIPTION = "Removes commented-out code"
HOMEPAGE = "https://github.com/myint/eradicate"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://eradicate;beginline=1;endline=20;md5=fd79d6777fc7d172cb3252653d5d05b5"

PYPI_PACKAGE = "eradicate"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "8a5f643c9054285123b3809844fbcea2"
SRC_URI[sha256sum] = "4ffda82aae6fd49dfffa777a857cb758d77502a1f2e0f54c9ac5155a39d2d01a"

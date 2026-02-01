SUMMARY = "JSON Web Token implementation in Python"
HOMEPAGE = "https://github.com/jpadilla/pyjwt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4b56d2c9973d8cf54655555be06e551"

PYPI_PACKAGE = "PyJWT"

SRC_URI[sha256sum] = "35f95c1f0fbe5d5ba6e43f00271c275f7a1a4db1dab27bf708073b75318ea623"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

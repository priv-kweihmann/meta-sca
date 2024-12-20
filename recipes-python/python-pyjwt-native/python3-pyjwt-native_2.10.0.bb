SUMMARY = "JSON Web Token implementation in Python"
HOMEPAGE = "https://github.com/jpadilla/pyjwt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4b56d2c9973d8cf54655555be06e551"

PYPI_PACKAGE = "PyJWT"

SRC_URI[sha256sum] = "7628a7eb7938959ac1b26e819a1df0fd3259505627b575e4bad6d08f76db695c"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

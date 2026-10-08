SUMMARY = "JSON Web Token implementation in Python"
HOMEPAGE = "https://github.com/jpadilla/pyjwt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4b56d2c9973d8cf54655555be06e551"

PYPI_PACKAGE = "PyJWT"

SRC_URI[sha256sum] = "4f259e80cdfb6b3fc18a7de51fd1ef9ec79652f25019bae68975ca2468a34df8"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

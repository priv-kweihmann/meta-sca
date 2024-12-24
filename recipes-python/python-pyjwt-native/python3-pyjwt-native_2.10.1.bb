SUMMARY = "JSON Web Token implementation in Python"
HOMEPAGE = "https://github.com/jpadilla/pyjwt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4b56d2c9973d8cf54655555be06e551"

PYPI_PACKAGE = "PyJWT"

SRC_URI[sha256sum] = "3cc5772eb20009233caf06e9d8a0577824723b44e6648ee0a2aedb6cf9381953"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

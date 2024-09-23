SUMMARY = "JSON Web Token implementation in Python"
HOMEPAGE = "https://github.com/jpadilla/pyjwt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4b56d2c9973d8cf54655555be06e551"

PYPI_PACKAGE = "pyjwt"
UPSTREAM_CHECK_REGEX ?= "/PyJWT/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[sha256sum] = "7e1e5b56cc735432a7369cbfa0efe50fa113ebecdc04ae6922deba8b84582d0c"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

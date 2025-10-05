SUMMARY = "Makes working with XML feel like you are working with JSON"
HOMEPAGE = "https://github.com/martinblech/xmltodict"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01441d50dc74476db58a41ac10cb9fa2"

PYPI_PACKAGE = "xmltodict"

SRC_URI[md5sum] = "82d8cb5a934a057e6a8a3449b1d87cce"
SRC_URI[sha256sum] = "54306780b7c2175a3967cad1db92f218207e5bc1aba697d887807c0fb68b7649"

inherit pypi
inherit setuptools3
inherit_defer native

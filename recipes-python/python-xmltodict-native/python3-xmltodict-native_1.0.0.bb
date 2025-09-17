SUMMARY = "Makes working with XML feel like you are working with JSON"
HOMEPAGE = "https://github.com/martinblech/xmltodict"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01441d50dc74476db58a41ac10cb9fa2"

PYPI_PACKAGE = "xmltodict"

SRC_URI[md5sum] = "e6b47a35497ce70cd76303a84e323ce0"
SRC_URI[sha256sum] = "f50eb9020d28c673b40bbe3f43458ee165f0267c67f8ad8df0d70d9a4f3ac824"

inherit pypi
inherit setuptools3
inherit_defer native

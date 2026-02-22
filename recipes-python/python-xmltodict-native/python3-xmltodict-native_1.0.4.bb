SUMMARY = "Makes working with XML feel like you are working with JSON"
HOMEPAGE = "https://github.com/martinblech/xmltodict"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01441d50dc74476db58a41ac10cb9fa2"

PYPI_PACKAGE = "xmltodict"

SRC_URI[md5sum] = "f0a83032fc31c918a8cd9e60cdb46cb1"
SRC_URI[sha256sum] = "6d94c9f834dd9e44514162799d344d815a3a4faec913717a9ecbfa5be1bb8e61"

inherit pypi
inherit setuptools3
inherit_defer native

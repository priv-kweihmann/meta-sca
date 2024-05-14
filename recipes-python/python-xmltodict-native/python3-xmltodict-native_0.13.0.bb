SUMMARY = "Makes working with XML feel like you are working with JSON"
HOMEPAGE = "https://github.com/martinblech/xmltodict"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01441d50dc74476db58a41ac10cb9fa2"

PYPI_PACKAGE = "xmltodict"

SRC_URI[md5sum] = "1ece0a5bbd494bac414058405606475e"
SRC_URI[sha256sum] = "341595a488e3e01a85a9d8911d8912fd922ede5fecc4dce437eb4b6c8d037e56"

inherit pypi
inherit setuptools3
inherit_defer native

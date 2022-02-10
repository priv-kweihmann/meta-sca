SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "f4bb468e5ca4edb66a82fd94467aaf6e"
SRC_URI[sha256sum] = "d43db6af6a350099e32e9e05e737013d0409287b761fa59c58a03e55dbc3648a"

inherit pypi
inherit setuptools3
inherit native

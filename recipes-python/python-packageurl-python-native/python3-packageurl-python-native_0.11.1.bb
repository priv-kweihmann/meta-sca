SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "6c1f90904fdbf340ee1a10821174dc0e"
SRC_URI[sha256sum] = "bbcc53d2cb5920c815c1626c75992f319bfc450b73893fa7bd8aac5869aa49fe"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "c34b1f171664642904dd0796ce1efd6d"
SRC_URI[sha256sum] = "63514d3b72f22a9c092913b3fa7b4670e479998dff3d93597863c413735e2ec7"

inherit pypi
inherit setuptools3
inherit native

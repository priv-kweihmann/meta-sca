SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "da54f8c014c784eb22fe9d508cbddccd"
SRC_URI[sha256sum] = "a7be3f3ba70d705f738ace9bf6124f31920245a49fa69d4b416da7037dd2de61"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

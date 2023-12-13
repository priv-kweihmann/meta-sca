SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "181d866579fa9e8a603b77a94c2a60ac"
SRC_URI[sha256sum] = "84f8053f4b85294b98b3b78715475847fb48f4525ec302d06dc35b26a9b3078a"

inherit pypi
inherit setuptools3
inherit native

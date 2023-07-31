SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "81c40ae1f3c95014f918c972384484fd"
SRC_URI[sha256sum] = "01fbf74a41ef85cf413f1ede529a1411f658bda66ed22d45d27280ad9ceba471"

inherit pypi
inherit setuptools3
inherit native

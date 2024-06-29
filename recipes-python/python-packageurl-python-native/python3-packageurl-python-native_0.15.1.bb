SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl_python"

SRC_URI[md5sum] = "7723b2c913ebf5d2ea382a5eb5129c4c"
SRC_URI[sha256sum] = "9a37b9a7cad9a2872b4612151ba3749fd9dec90485577c14d374b6e66b7edf03"

inherit pypi
inherit setuptools3
inherit_defer native

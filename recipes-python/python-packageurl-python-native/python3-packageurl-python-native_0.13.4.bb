SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "d26a185e1397da50e50333b989c30d23"
SRC_URI[sha256sum] = "6eb5e995009cc73387095e0b507ab65df51357d25ddc5fce3d3545ad6dcbbee8"

inherit pypi
inherit setuptools3
inherit native

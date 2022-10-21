SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "c55a9096e4274239eb0e64951c3c59f2"
SRC_URI[sha256sum] = "5c91334f942cd55d45eb0c67dd339a535ef90e25f05b9ec016ad188ed0ef9048"

inherit pypi
inherit setuptools3
inherit native

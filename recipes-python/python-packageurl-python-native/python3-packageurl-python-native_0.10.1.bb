SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "2b008b3aced5352fd632e1813ab7457d"
SRC_URI[sha256sum] = "f3a552ac743116cd79e25cfbb8ca8f938b06f91ca2a52deba80f06a2a7010749"

inherit pypi
inherit setuptools3
inherit native

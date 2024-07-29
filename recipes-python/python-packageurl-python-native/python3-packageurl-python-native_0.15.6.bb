SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl_python"

SRC_URI[md5sum] = "72051c47db37e08d52946f206a55f8c2"
SRC_URI[sha256sum] = "cbc89afd15d5f4d05db4f1b61297e5b97a43f61f28799f6d282aff467ed2ee96"

inherit pypi
inherit setuptools3
inherit_defer native

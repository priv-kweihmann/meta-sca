SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "c603d45dcc4e50cb40a8303d8cb3efc7"
SRC_URI[sha256sum] = "f219b2ce6348185a27bd6a72e6fdc9f984e6c9fa157effa7cb93e341c49cdcc2"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "680735f3317191a3c1dd9ce611906e45"
SRC_URI[sha256sum] = "a01371a9015fb5c1a3c62eb2f7250b87d1733fced57f075e30715eb8e15e075d"

inherit pypi
inherit setuptools3
inherit native

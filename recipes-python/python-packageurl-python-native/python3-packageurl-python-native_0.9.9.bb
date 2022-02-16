SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "35651efef038a54f5083197038d358c0"
SRC_URI[sha256sum] = "872a0434b9a448b3fa97571711f69dd2a3fb72345ad66c90b17d827afea82f09"

inherit pypi
inherit setuptools3
inherit native

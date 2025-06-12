SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "bc2a019812c3f3afe2186b18bcc4319c"
SRC_URI[sha256sum] = "5db592a990b60bc02446033c50fb1803a26c5124cd72c5a2cd1b8ea1ae741969"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

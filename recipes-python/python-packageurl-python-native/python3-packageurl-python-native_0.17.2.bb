SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "3017492ef5a3c8d8e9cf7dfd88243718"
SRC_URI[sha256sum] = "dc087e3a3340656c6966a3d651f12c7f689f01dc9fb8a28f1150f7be823c688e"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

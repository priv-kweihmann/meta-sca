SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "7510a4ac5e76a176e0d2231b43f5321b"
SRC_URI[sha256sum] = "69e3bf8a3932fe9c2400f56aaeb9f86911ecee2f9398dbe1b58ec34340be365d"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

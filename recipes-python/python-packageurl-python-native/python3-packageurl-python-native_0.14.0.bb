SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "a3383545580f9577d299e8baddbde9bb"
SRC_URI[sha256sum] = "ff09147cddaae9e5c59ffcb12df8ec0e1b774b45099399f28c36b1a3dfdf52e2"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "919ecc321049f52b117fb531ec837ef9"
SRC_URI[sha256sum] = "bd0e829260baff12055c47e1898e0f4014469d09bdb380ddcb102b5d2392fb56"

inherit pypi
inherit setuptools3
inherit native

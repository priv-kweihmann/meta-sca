SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl-python"

SRC_URI[md5sum] = "d3b2debea0b66f50a4b0d879b84a1ae0"
SRC_URI[sha256sum] = "99df143960b7100fff3b2cf5b0beba2f64b6d8c818f6c9f125aed6fac7438763"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl_python"

SRC_URI[md5sum] = "919b69f111ec41ceb134b57bde846751"
SRC_URI[sha256sum] = "9ea4215e2bcd7d2369d0b7857abba7def81f3fa217d7903fc72661c946c75e0f"

inherit pypi
inherit setuptools3
inherit_defer native


SUMMARY = "Data-Driven Tests for Python Unittest"
HOMEPAGE = "https://github.com/datadriventests/ddt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=31d3abdb5983f06c0f7c19f4b9f61830"

DEPENDS += "python3-nose-native"

PYPI_PACKAGE = "ddt"

SRC_URI[md5sum] = "6f6cc1f1c97d6ff304bcd918aa6c24c1"
SRC_URI[sha256sum] = "0595e70d074e5777771a45709e99e9d215552fb1076443a25fad6b23d8bf38da"

inherit pypi
inherit setuptools3
inherit native

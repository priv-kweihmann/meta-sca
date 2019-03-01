SUMMARY = "Data-Driven Tests for Python Unittest"
DESCRIPTION = "Data-Driven Tests for Python Unittest"
HOMEPAGE = "https://github.com/datadriventests/ddt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=31d3abdb5983f06c0f7c19f4b9f61830"

PV = "1.2.1"

SRC_URI[md5sum] = "1270d706454088ea108f23fbaa800e56"
SRC_URI[sha256sum] = "d13e6af8f36238e89d00f4ebccf2bda4f6d1878be560a6600689e42077e164e3"

DEPENDS += "python3-native"

PYPI_PACKAGE = "ddt"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/ddt"

BBCLASSEXTEND = "native nativesdk"

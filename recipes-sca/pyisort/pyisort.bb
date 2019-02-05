SUMMARY = "isort"
DESCRIPTION = "Sort python imports - used by static code analysis checkers"
HOMEPAGE = "https://github.com/timothycrosley/isort"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PV = "4.2.15"

SRC_URI[md5sum] = "34915a2ce60e6fe3dbcbf5982deef9b4"
SRC_URI[sha256sum] = "79f46172d3a4e2e53e7016e663cc7a8b538bec525c36675fcfd2767df30b3983"

RDEPENDS_${PN} += "python3-native"
PYPI_PACKAGE = "isort"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/isort"

BBCLASSEXTEND = "native nativesdk"

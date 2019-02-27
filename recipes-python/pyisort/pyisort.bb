SUMMARY = "isort"
DESCRIPTION = "Sort python imports - used by static code analysis checkers"
HOMEPAGE = "https://github.com/timothycrosley/isort"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PV = "4.3.4"

SRC_URI[md5sum] = "fb554e9c8f9aa76e333a03d470a5cf52"
SRC_URI[sha256sum] = "b9c40e9750f3d77e6e4d441d8b0266cf555e7cdabdcff33c4fd06366ca761ef8"

PYPI_PACKAGE = "isort"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/isort"

BBCLASSEXTEND = "native nativesdk"

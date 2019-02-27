SUMMARY = "isort"
DESCRIPTION = "Sort python imports - used by static code analysis checkers"
HOMEPAGE = "https://github.com/timothycrosley/isort"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PV = "4.3.9"

SRC_URI[md5sum] = "97843adc4f5f77bdcc5f7516d92a8504"
SRC_URI[sha256sum] = "f19b23b22fb5a919a081bc31aabcc0991614c244d9215267e11abf2ca7b684ce"

PYPI_PACKAGE = "isort"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/isort"

BBCLASSEXTEND = "native nativesdk"

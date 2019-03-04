SUMMARY = "isort"
DESCRIPTION = "Sort python imports - used by static code analysis checkers"
HOMEPAGE = "https://github.com/timothycrosley/isort"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PV = "4.3.10"

SRC_URI[md5sum] = "54c000374fb51f6ea22a59e46709888a"
SRC_URI[sha256sum] = "144c4295314c0ed34fb034f838b2b7e242c52dd3eafdd6f5d49078692f582c0c"

PYPI_PACKAGE = "isort"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/isort"

inherit native

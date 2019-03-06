SUMMARY = "isort"
DESCRIPTION = "Sort python imports - used by static code analysis checkers"
HOMEPAGE = "https://github.com/timothycrosley/isort"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

inherit pypi

FILES_${PN} += "${datadir}/isort"

inherit native

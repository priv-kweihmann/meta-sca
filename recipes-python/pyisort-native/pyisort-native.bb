SUMMARY = "isort"
DESCRIPTION = "Sort python imports - used by static code analysis checkers"
HOMEPAGE = "https://github.com/timothycrosley/isort"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PV = "4.3.11"

SRC_URI[md5sum] = "bb06686483856de4ab3d10a711fe97f2"
SRC_URI[sha256sum] = "909141ae3ac8c78daa9a6ae61371ad6daa628f533f6d3e01e5a0d073864ef26b"

PYPI_PACKAGE = "isort"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/isort"

inherit native

SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "4f27dd980667a218a9167a601f136fd3"
SRC_URI[sha256sum] = "83510593e07e433b77bd5bff0f6f607dbafa06d1a89022616f02d8b699cfcd56"

inherit pypi
inherit setuptools3
inherit native

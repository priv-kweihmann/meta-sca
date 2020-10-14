SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "d2dfc32943b1d64311facec6a05c2f98"
SRC_URI[sha256sum] = "dcaeec1b5f0eca77faea2a35ab790b4f3680ff75590bfcb7145986905aab2f58"

inherit pypi
inherit setuptools3
inherit native

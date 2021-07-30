SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "e8fba9f947e55423f118f36f6dbd2d98"
SRC_URI[sha256sum] = "9c2ea1e62d871267b78307fe511c0838ba0da28698c5732d54e2790bf3ba9899"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "Clean single-source support for Python 3 and 2"
DESCRIPTION = "Clean single-source support for Python 3 and 2"
HOMEPAGE = "https://github.com/PythonCharmers/python-future"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3c00b89de8dabf26a9b70748ccf4c477"

PYPI_PACKAGE = "future"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "e42113b4b72fabb5273ff88417104913"
SRC_URI[sha256sum] = "67045236dcfd6816dc439556d009594abf643e5eb48992e36beac09c2ca659b8"

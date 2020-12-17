SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "65d4d38d68b3e91ca41b99583086b91f"
SRC_URI[sha256sum] = "fa7c170df68ca6367eda061e9ec339ae3e6d3679c31e04033f83ef97a7d7d0ce"

inherit pypi
inherit native
inherit setuptools3

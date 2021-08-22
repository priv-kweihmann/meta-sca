SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "0b7b806612966a1b2353479dd11dd9ac"
SRC_URI[sha256sum] = "0a6422737f6d89b45cdef1e2df5576f52ad0f507956002ce1020daa9f44211d6"

inherit pypi
inherit setuptools3
inherit native

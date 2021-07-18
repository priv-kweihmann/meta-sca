SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "165a72956198b7119da2f747c18736ce"
SRC_URI[sha256sum] = "d4bd1c4f90eac90a73e1bdc59c31d03943f218d687f3c5a09e48478841a8af5f"

inherit pypi
inherit setuptools3
inherit native

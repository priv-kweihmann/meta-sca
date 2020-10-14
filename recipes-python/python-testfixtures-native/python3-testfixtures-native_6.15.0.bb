SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "96ac7155e1b009b4f08e6f92df4418af"
SRC_URI[sha256sum] = "409f77cfbdad822d12a8ce5c4aa8fb4d0bb38073f4a5444fede3702716a2cec2"

inherit pypi
inherit native
inherit setuptools3

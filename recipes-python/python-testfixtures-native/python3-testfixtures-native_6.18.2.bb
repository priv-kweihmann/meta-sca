SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "3558a830e0f72e114b1b63229cbd0384"
SRC_URI[sha256sum] = "61c25cb0213f68d2dcd2b098d9d2e7f47afc3b4429d66e1cdeb1072be2fcb241"

inherit pypi
inherit setuptools3
inherit native

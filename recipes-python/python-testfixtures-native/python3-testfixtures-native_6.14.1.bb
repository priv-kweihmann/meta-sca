SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "d988e611192cb633d6a4dfe94af55dd7"
SRC_URI[sha256sum] = "58d2b3146d93bc5ddb0cd24e0ccacb13e29bdb61e5c81235c58f7b8ee4470366"

inherit pypi
inherit native
inherit setuptools3

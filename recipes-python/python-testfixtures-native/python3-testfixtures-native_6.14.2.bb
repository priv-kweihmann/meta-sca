SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "66f16906c9de2f3a130754ed4d755cfa"
SRC_URI[sha256sum] = "14d9907390f5f9c7189b3d511b64f34f1072d07cc13b604a57e1bb79029376e3"

inherit pypi
inherit native
inherit setuptools3

SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "8928e13e4cf560cd51e36355a7f67a57"
SRC_URI[sha256sum] = "f3f567f35b3d004b0e19ee7dff61e75e3c05f3ffc1c41580d967b1fe144b3de9"

inherit pypi
inherit native
inherit setuptools3

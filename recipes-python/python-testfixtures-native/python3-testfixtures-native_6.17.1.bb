SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "60d0050df51c48843408a15a1c993c53"
SRC_URI[sha256sum] = "5ec3a0dd6f71cc4c304fbc024a10cc293d3e0b852c868014b9f233203e149bda"

inherit pypi
inherit native
inherit setuptools3

SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "9e26c2dff77bf7bf1e7cb16062ac1b3c"
SRC_URI[sha256sum] = "37a13ba168a02ac54cc5891a42b1caec333e59b66addb7fa633ea8a6d73445c0"

inherit pypi
inherit setuptools3
inherit native

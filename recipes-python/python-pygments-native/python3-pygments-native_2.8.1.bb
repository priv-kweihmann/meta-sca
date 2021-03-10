SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "54b958b3eb6a59e778396eccc7158fff"
SRC_URI[sha256sum] = "2656e1a6edcdabf4275f9a3640db59fd5de107d88e8663c5d4e9a0fa62f77f94"

inherit pypi
inherit setuptools3
inherit native

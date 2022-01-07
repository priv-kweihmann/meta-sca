SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "217b4355612df4b61dc570df4b0148ba"
SRC_URI[sha256sum] = "4e426f72023d88d03b2fa258de560726ce890ff3b630f88c21cbb8b2503b8c6a"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "87369a4e15019caf9cf056ab2c5858b3"
SRC_URI[sha256sum] = "f398865f7eb6874156579fdf36bc840a03cab64d1cde9e93d68f46a425ec52c6"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "Docutils -- Python Documentation Utilities"
HOMEPAGE = "http://docutils.sourceforge.net/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & GPLv3 & Python-2.0"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=01aec8e28f975e3f369e06b5eb2af9b9"

PYPI_PACKAGE = "docutils"

SRC_URI[md5sum] = "ca5827e2432fd58f4c8d74a6591135de"
SRC_URI[sha256sum] = "679987caf361a7539d76e584cbeddc311e3aee937877c87346f31debc63e9d06"

inherit pypi
inherit setuptools3
inherit native

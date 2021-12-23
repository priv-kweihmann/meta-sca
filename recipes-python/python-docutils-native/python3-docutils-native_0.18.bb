SUMMARY = "Docutils -- Python Documentation Utilities"
HOMEPAGE = "http://docutils.sourceforge.net/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & GPLv3 & Python-2.0"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=01aec8e28f975e3f369e06b5eb2af9b9"

PYPI_PACKAGE = "docutils"

SRC_URI[md5sum] = "a987166c84d18fc5de290208d92390f5"
SRC_URI[sha256sum] = "c1d5dab2b11d16397406a282e53953fe495a46d69ae329f55aa98a5c4e3c5fbb"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "Docutils -- Python Documentation Utilities"

HOMEPAGE = "http://docutils.sourceforge.net/"

LICENSE = "BSD-2-Clause & GPLv3 & Python-2.0"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=7a4646907ab9083c826280b19e103106"

PYPI_PACKAGE = "docutils"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "e26a308d8000b0bed7416a633217c676"
SRC_URI[sha256sum] = "a2aeea129088da402665e92e0b25b04b073c04b2dce4ab65caaa38b7ce2e1a99"

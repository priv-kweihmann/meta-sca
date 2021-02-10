SUMMARY = "Docutils -- Python Documentation Utilities"
HOMEPAGE = "http://docutils.sourceforge.net/"

LICENSE = "BSD-2-Clause & GPLv3 & Python-2.0"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=7a4646907ab9083c826280b19e103106"

PYPI_PACKAGE = "docutils"

SRC_URI[md5sum] = "44952782107930ddfcd37ae48eee0857"
SRC_URI[sha256sum] = "c2de3a60e9e7d07be26b7f2b00ca0309c207e06c100f9cc2a94931fc75a478fc"

inherit pypi
inherit setuptools3
inherit native

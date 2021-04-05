SUMMARY = "Docutils -- Python Documentation Utilities"
HOMEPAGE = "http://docutils.sourceforge.net/"

LICENSE = "BSD-2-Clause & GPLv3 & Python-2.0"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=836a1950177996968a49ff477a4a61c4"

PYPI_PACKAGE = "docutils"

SRC_URI[md5sum] = "abebc3d26886aec6faaa13f66384a6fc"
SRC_URI[sha256sum] = "e2ffeea817964356ba4470efba7c2f42b6b0de0b04e66378507e3e2504bbff4c"

inherit pypi
inherit setuptools3
inherit native

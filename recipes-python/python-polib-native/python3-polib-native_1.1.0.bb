SUMMARY = "A library to manipulate gettext files (po and mo files)."
DESCRIPTION = "A library to manipulate gettext files (po and mo files)."
HOMEPAGE = "https://bitbucket.org/izi/polib/wiki/Home"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca9b0a3e473327024be9af47bc41fb14"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "polib"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "eeedc0f1e8f2dbfbb6192772d02795e0"
SRC_URI[sha256sum] = "fad87d13696127ffb27ea0882d6182f1a9cf8a5e2b37a587751166c51e5a332a"

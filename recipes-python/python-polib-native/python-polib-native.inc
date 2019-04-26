SUMMARY = "A library to manipulate gettext files (po and mo files)."
DESCRIPTION = "A library to manipulate gettext files (po and mo files)."
HOMEPAGE = "https://bitbucket.org/izi/polib/wiki/Home"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca9b0a3e473327024be9af47bc41fb14"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "polib"

inherit pypi

FILES_${PN} += "${datadir}/polib"

inherit native

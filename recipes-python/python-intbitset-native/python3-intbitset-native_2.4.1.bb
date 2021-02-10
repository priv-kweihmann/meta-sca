SUMMARY = "C-based extension implementing fast integer bit sets"
HOMEPAGE = "http://github.com/inveniosoftware/intbitset/"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
            python3-six-native \
           "

PYPI_PACKAGE = "intbitset"

SRC_URI[md5sum] = "4f76e100da761aa92188151c0dbdec60"
SRC_URI[sha256sum] = "44bca80b8cc702d5a56f0686f2bb5e028ab4d0c2c1761941589d46b7fa2c701c"

inherit pypi
inherit setuptools3
inherit native

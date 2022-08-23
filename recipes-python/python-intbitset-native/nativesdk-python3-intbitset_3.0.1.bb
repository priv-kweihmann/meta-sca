SUMMARY = "C-based extension implementing fast integer bit sets"
HOMEPAGE = "http://github.com/inveniosoftware/intbitset/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "nativesdk-python3-six"

PYPI_PACKAGE = "intbitset"

SRC_URI[md5sum] = "8f417e4ec5879841fde7aa873320ffdc"
SRC_URI[sha256sum] = "f1e6d03c6729922a223c51849df65b9e916e625aefb911784e7f9acd4c207d53"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-six"

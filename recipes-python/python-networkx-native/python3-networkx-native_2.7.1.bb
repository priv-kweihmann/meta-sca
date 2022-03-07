SUMMARY = "Python package for creating and manipulating graphs and networks"
HOMEPAGE = "https://github.com/networkx/networkx"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=44614b6df7cf3c19be69d0a945e29904"

DEPENDS += "python3-pandas-native"

PYPI_PACKAGE = "networkx"

SRC_URI[md5sum] = "a5cf17642550a2134c15414889d66dfa"
SRC_URI[sha256sum] = "d1194ba753e5eed07cdecd1d23c5cd7a3c772099bd8dbd2fea366788cf4de7ba"

inherit pypi
inherit setuptools3
inherit native

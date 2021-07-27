SUMMARY = "Python package for creating and manipulating graphs and networks"
HOMEPAGE = "https://github.com/networkx/networkx"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5cfa4d8f5881e0d053bb497130b9c73a"

DEPENDS += "python3-pandas-native"

PYPI_PACKAGE = "networkx"

SRC_URI[md5sum] = "ac9cf192fc525bb877a042a684091d72"
SRC_URI[sha256sum] = "2306f1950ce772c5a59a57f5486d59bb9cab98497c45fc49cbc45ac0dec119bb"

inherit pypi
inherit setuptools3
inherit native

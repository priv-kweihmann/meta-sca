SUMMARY = "Option groups missing in Click"
HOMEPAGE = "https://github.com/click-contrib/click-option-group"

DEPENDS += "python3-click-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f10e5cf198b01ce7c7ed725a55d3b39d"

SRC_URI[md5sum] = "43e956a33cfa9010363b7d16da836ce1"
SRC_URI[sha256sum] = "a6e924f3c46b657feb5b72679f7e930f8e5b224b766ab35c91ae4019b4e0615e"

PYPI_PACKAGE = "click-option-group"

inherit pypi
inherit setuptools3
inherit native

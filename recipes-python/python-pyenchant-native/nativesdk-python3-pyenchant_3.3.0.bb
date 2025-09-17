SUMMARY = "spellchecking library for python"
HOMEPAGE = "https://github.com/rfk/pyenchant"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=fbc093901857fcd118f065f900982c24"

DEPENDS += "nativesdk-enchant2"

PYPI_PACKAGE = "pyenchant"

SRC_URI[md5sum] = "b46cf500e9a67eabd3c32108ec33ce6d"
SRC_URI[sha256sum] = "825288246b5debc9436f91967650974ef0d5636458502619e322c476f1283891"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-enchant2 \
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
"

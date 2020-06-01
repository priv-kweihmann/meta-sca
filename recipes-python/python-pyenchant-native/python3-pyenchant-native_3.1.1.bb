SUMMARY = "spellchecking library for python"
HOMEPAGE = "https://github.com/rfk/pyenchant"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS += "enchant-native"

PYPI_PACKAGE = "pyenchant"

SRC_URI[md5sum] = "1e894030a64792d88f2775bacd295bb1"
SRC_URI[sha256sum] = "ce0915d7acd771fde6e8c2dce8ad0cb0e6f7c4fa8430cc96e3e7134e99aeb12f"

inherit pypi
inherit native
inherit setuptools3

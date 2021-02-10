SUMMARY = "spellchecking library for python"
HOMEPAGE = "https://github.com/rfk/pyenchant"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS += "enchant-native"

PYPI_PACKAGE = "pyenchant"

SRC_URI[md5sum] = "c38dd0ce5ac7142ba66072a7fca12c6f"
SRC_URI[sha256sum] = "6b97e9a9f132fa7c9029a6635d821ccad67d4980e68186d02c765b4256b6f152"

inherit pypi
inherit setuptools3
inherit native

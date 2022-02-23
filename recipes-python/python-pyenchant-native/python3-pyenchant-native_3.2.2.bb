SUMMARY = "spellchecking library for python"
HOMEPAGE = "https://github.com/rfk/pyenchant"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS += "enchant2-native"

PYPI_PACKAGE = "pyenchant"

SRC_URI[md5sum] = "15d45b7517c80cfa5d9fa636a88e0bf9"
SRC_URI[sha256sum] = "1cf830c6614362a78aab78d50eaf7c6c93831369c52e1bb64ffae1df0341e637"

inherit pypi
inherit setuptools3
inherit native

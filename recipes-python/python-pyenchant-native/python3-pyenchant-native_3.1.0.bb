SUMMARY = "spellchecking library for python"
HOMEPAGE = "https://github.com/rfk/pyenchant"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS += "enchant2-native"

PYPI_PACKAGE = "pyenchant"

SRC_URI[md5sum] = "5e8b6e02a7459b040a51f000c5ac37e3"
SRC_URI[sha256sum] = "2b4594e125c9fbc7fff2d310be141a4ace1f8af3e671c63ebd261407c82d3a92"

inherit pypi
inherit native
inherit setuptools3

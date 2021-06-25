SUMMARY = "spellchecking library for python"
HOMEPAGE = "https://github.com/rfk/pyenchant"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS += "enchant2-native"

PYPI_PACKAGE = "pyenchant"

SRC_URI[md5sum] = "563b7b32d1cb8ecb157ded7a7b081632"
SRC_URI[sha256sum] = "5e206a1d6596904a922496f6c9f7d0b964b243905f401f5f2f40ea4d1f74e2cf"

inherit pypi
inherit setuptools3
inherit native

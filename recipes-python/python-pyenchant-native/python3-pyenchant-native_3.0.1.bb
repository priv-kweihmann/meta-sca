SUMMARY = "spellchecking library for python"
HOMEPAGE = "https://github.com/rfk/pyenchant"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS += "enchant2-native"

PYPI_PACKAGE = "pyenchant"

SRC_URI[md5sum] = "2de539a7a3cf62ca649de61cabc3d8cb"
SRC_URI[sha256sum] = "1bd26a644abf80196a9de3f2d820ebafb7e7f78385e392ce77cb1552f164d559"

inherit pypi
inherit native
inherit setuptools3

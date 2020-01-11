SUMMARY = "spellchecking library for python"
HOMEPAGE = "https://github.com/rfk/pyenchant"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS += "enchant2-native"

PYPI_PACKAGE = "pyenchant"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "c224ea53e119b04116d5301e5027051c"
SRC_URI[sha256sum] = "fc31cda72ace001da8fe5d42f11c26e514a91fa8c70468739216ddd8de64e2a0"

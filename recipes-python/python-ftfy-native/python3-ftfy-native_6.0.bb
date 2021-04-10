SUMMARY = "fixes text for you"
HOMEPAGE = "http://github.com/LuminosoInsight/python-ftfy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=49e07a5dd7a24f453625e67c4f9ac59d"

DEPENDS += "python3-wcwidth-native"

PYPI_PACKAGE = "ftfy"

SRC_URI[md5sum] = "fd4dd70a088c32a51fdbd6fc0af697d7"
SRC_URI[sha256sum] = "4d7445f7c05d4ad3751147094da400dcf1f7a9c93844f5ed168bbcf17e4598ca"

inherit pypi
inherit setuptools3
inherit native

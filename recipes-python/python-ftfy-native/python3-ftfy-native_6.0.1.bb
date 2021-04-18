SUMMARY = "fixes text for you"
HOMEPAGE = "http://github.com/LuminosoInsight/python-ftfy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=49e07a5dd7a24f453625e67c4f9ac59d"

DEPENDS += "python3-wcwidth-native"

PYPI_PACKAGE = "ftfy"

SRC_URI[md5sum] = "b6f7175c5269f6efe12f0f48fdee8e8f"
SRC_URI[sha256sum] = "9eb68533eb2a6124e96ed7f63049e6c519194fda3fae92629b5e0b5753cb2c8f"

inherit pypi
inherit setuptools3
inherit native

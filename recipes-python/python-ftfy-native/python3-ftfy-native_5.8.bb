SUMMARY = "fixes text for you"
HOMEPAGE = "http://github.com/LuminosoInsight/python-ftfy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=49e07a5dd7a24f453625e67c4f9ac59d"

DEPENDS += "python3-wcwidth-native"

PYPI_PACKAGE = "ftfy"

SRC_URI[md5sum] = "d611a51fc169aa3eb18321d5ca6c7da0"
SRC_URI[sha256sum] = "51c7767f8c4b47d291fcef30b9625fb5341c06a31e6a3b627039c706c42f3720"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "fixes text for you"
HOMEPAGE = "http://github.com/LuminosoInsight/python-ftfy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=49e07a5dd7a24f453625e67c4f9ac59d"

DEPENDS += "python3-wcwidth-native"

PYPI_PACKAGE = "ftfy"

SRC_URI[md5sum] = "5bc4119a31ce162eab8cc79194671a97"
SRC_URI[sha256sum] = "8c4fb2863c0b82eae2ab3cf353d9ade268dfbde863d322f78d6a9fd5cefb31e9"

inherit pypi
inherit setuptools3
inherit native

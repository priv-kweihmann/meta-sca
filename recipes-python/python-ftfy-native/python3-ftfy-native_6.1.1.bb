SUMMARY = "fixes text for you"
HOMEPAGE = "http://github.com/LuminosoInsight/python-ftfy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=49e07a5dd7a24f453625e67c4f9ac59d"

DEPENDS += "python3-wcwidth-native"

PYPI_PACKAGE = "ftfy"

SRC_URI[md5sum] = "9989e7306e3e483f06cb7fb418b0a05b"
SRC_URI[sha256sum] = "bfc2019f84fcd851419152320a6375604a0f1459c281b5b199b2cd0d2e727f8f"

inherit pypi
inherit setuptools3
inherit native

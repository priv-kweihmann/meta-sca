SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "df2353f180959134c588b0d54150d1cf"
SRC_URI[sha256sum] = "94762a3a5a343a79b28754f96c554bce057a592a4896907d73f0369fe824e053"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

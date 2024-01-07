SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "556adcc6980bd478657598718f2c1155"
SRC_URI[sha256sum] = "1c61603ff154621fb2a9172037d84dca3500def8c8b630657d1701f026f8af3f"

inherit pypi
inherit setuptools3
inherit native

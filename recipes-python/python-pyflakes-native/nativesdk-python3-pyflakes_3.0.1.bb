SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "e3aecdfd560b4d4a5441ee5b43cc0580"
SRC_URI[sha256sum] = "ec8b276a6b60bd80defed25add7e439881c19e64850afd9b346283d4165fd0fd"

inherit pypi
inherit setuptools3
inherit nativesdk

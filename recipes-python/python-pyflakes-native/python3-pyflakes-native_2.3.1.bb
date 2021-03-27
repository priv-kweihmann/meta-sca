SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "0b60a307a6b293ee505fe0134e9d46e9"
SRC_URI[sha256sum] = "f5bc8ecabc05bb9d291eb5203d6810b49040f6ff446a756326104746cc00c1db"

inherit pypi
inherit setuptools3
inherit native

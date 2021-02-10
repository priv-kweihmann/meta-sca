SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "48b1c29732ca810a70cba0e6d0531169"
SRC_URI[sha256sum] = "35b2d75ee967ea93b55750aa9edbbf72813e06a66ba54438df2cfac9e3c27fc8"

inherit pypi
inherit setuptools3
inherit native

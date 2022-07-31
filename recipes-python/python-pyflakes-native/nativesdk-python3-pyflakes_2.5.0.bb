SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "2d0f543a3a6267bb6c8eb5fd63576dad"
SRC_URI[sha256sum] = "491feb020dca48ccc562a8c0cbe8df07ee13078df59813b83959cbdada312ea3"

inherit pypi
inherit setuptools3
inherit nativesdk

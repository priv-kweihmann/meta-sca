SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "6c23bf65e3c0bc19ad084e4d41162211"
SRC_URI[sha256sum] = "592beb57058eb82eb190fb7514f2081c555c51000b029ff71286a681e6cf2f83"

inherit pypi
inherit setuptools3
inherit_defer native

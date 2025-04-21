SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "9bdc5cda9ddfa547e1e1def7a78b08f6"
SRC_URI[sha256sum] = "6dfd61d87b97fba5dcfaaf781171ac16be16453be6d816147989e7f6e6a9576b"

inherit pypi
inherit setuptools3
inherit_defer native

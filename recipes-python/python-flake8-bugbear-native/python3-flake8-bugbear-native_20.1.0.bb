SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"

HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

PYPI_PACKAGE = "flake8-bugbear"

DEPENDS += " \  
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-flake8-native \
            "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "c6be2df77010ca9d179c866aae5bfcb6"
SRC_URI[sha256sum] = "775aa4cbff549d0e6a2e80c323297dc348f077186bfd556afe2354fffcac5c86"

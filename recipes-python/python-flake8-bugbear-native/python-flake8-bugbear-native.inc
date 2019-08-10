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

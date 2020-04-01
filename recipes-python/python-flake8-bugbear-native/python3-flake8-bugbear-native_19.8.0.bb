SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "39251f96f2e31155d25a8fe222c2e7e0"
SRC_URI[sha256sum] = "d8c466ea79d5020cb20bf9f11cf349026e09517a42264f313d3f6fddb83e0571"

inherit pypi
inherit native
inherit setuptools3

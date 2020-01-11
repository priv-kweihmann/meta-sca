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

SRC_URI[md5sum] = "bcc802faaeb09a8f4a6b988cbbff42e0"
SRC_URI[sha256sum] = "bc4a35972342256abddf84591fbb82f7360981db1b71e39a8ba0400e906239cf"

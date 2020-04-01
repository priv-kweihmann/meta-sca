SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "4bf5a8b9aca13aeaf52eab92122cf1ca"
SRC_URI[sha256sum] = "bd02e4b009fb153fe6072c31c52aeab5b133d508095befb2ffcf3b41c4823162"

inherit pypi
inherit native
inherit setuptools3

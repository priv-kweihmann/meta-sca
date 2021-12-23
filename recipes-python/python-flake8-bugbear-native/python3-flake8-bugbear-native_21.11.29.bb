SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            python3-attrs-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "fb92eaa4f47e11123ee1fed4c9a08606"
SRC_URI[sha256sum] = "8b04cb2fafc6a78e1a9d873bd3988e4282f7959bb6b0d7c1ae648ec09b937a7b"

inherit pypi
inherit setuptools3
inherit native

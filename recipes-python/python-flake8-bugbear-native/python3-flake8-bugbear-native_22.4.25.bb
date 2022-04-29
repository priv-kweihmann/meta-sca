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

SRC_URI[md5sum] = "226582bd4d8d58196a2352620532379c"
SRC_URI[sha256sum] = "f7c080563fca75ee6b205d06b181ecba22b802babb96b0b084cc7743d6908a55"

inherit pypi
inherit setuptools3
inherit native

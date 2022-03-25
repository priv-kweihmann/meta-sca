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

SRC_URI[md5sum] = "65af05353151efb959b9c6851ff1ccb5"
SRC_URI[sha256sum] = "e0dc2a36474490d5b1a2d57f9e4ef570abc09f07cbb712b29802e28a2367ff19"

inherit pypi
inherit setuptools3
inherit native

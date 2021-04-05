SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            python3-attrs-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "895a39c34504f314cc0c3d6286782d6a"
SRC_URI[sha256sum] = "2346c81f889955b39e4a368eb7d508de723d9de05716c287dc860a4073dc57e7"

inherit pypi
inherit setuptools3
inherit native

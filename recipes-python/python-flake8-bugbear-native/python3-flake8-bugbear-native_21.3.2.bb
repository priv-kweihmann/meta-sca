SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            python3-attrs-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "3af76c84dd1122dcdf500a72a849ecfb"
SRC_URI[sha256sum] = "cadce434ceef96463b45a7c3000f23527c04ea4b531d16c7ac8886051f516ca0"

inherit pypi
inherit setuptools3
inherit native

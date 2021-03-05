SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            python3-attrs-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "0060ce04bacdb72c1af5e9d255a30820"
SRC_URI[sha256sum] = "ea08deb8922486e856b38c9338936de1e1de4ad9e7c912be142673d5afe5ac89"

inherit pypi
inherit setuptools3
inherit native

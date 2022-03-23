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

SRC_URI[md5sum] = "2f7ec34afe819e6ee3e05b9a481bf0a0"
SRC_URI[sha256sum] = "152e64a86f6bff6e295d630ccc993f62434c1fd2b20d2fae47547cb1c1b868e0"

inherit pypi
inherit setuptools3
inherit native

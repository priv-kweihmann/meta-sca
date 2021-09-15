SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            python3-attrs-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "59ee55f7c9e5dbb2ac6dcb134512ac27"
SRC_URI[sha256sum] = "2f60c8ce0dc53d51da119faab2d67dea978227f0f92ed3c44eb7d65fb2e06a96"

inherit pypi
inherit setuptools3
inherit native

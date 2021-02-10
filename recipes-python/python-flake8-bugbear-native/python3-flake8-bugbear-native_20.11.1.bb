SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            python3-attrs-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "fe2a921fa10ffc139f7feb9580f6b104"
SRC_URI[sha256sum] = "528020129fea2dea33a466b9d64ab650aa3e5f9ffc788b70ea4bc6cf18283538"

inherit pypi
inherit setuptools3
inherit native

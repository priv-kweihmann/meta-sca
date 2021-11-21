SUMMARY = "A plugin for Flake8 finding likely bugs and design problems in your program"
HOMEPAGE = "https://github.com/PyCQA/flake8-bugbear"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d511f8e447826b7e5b61da03a3f5e82b"

DEPENDS += "\
            python3-attrs-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8-bugbear"

SRC_URI[md5sum] = "b3aeeeccf1ebf08c9668af7bf18a489e"
SRC_URI[sha256sum] = "db9a09893a6c649a197f5350755100bb1dd84f110e60cf532fdfa07e41808ab2"

inherit pypi
inherit setuptools3
inherit native

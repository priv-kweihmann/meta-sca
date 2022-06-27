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

SRC_URI[md5sum] = "60e6c29fe2a6a6513d664425b5fe248c"
SRC_URI[sha256sum] = "ac3317eba27d79dc19dcdeb7356ca1f656f0cde11d899c4551badf770f05cbef"

inherit pypi
inherit setuptools3
inherit native

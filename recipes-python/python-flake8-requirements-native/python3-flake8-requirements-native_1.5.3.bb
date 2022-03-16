SUMMARY = "Package requirements checker, plugin for flake8"
HOMEPAGE = "https://github.com/Arkq/flake8-requirements"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e37d68747f8cd3c0ec28d12f1492271"

DEPENDS += "\
            python3-flake8-native \
            python3-toml-native \
            "

SRC_URI = "git://github.com/Arkq/flake8-requirements.git;branch=master;protocol=https"
SRCREV = "368d0b190ae563b668f3e16c447f5b555a6602a1"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

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
SRCREV = "4ee2e8614bf3b71c7432975705c836cf35ce4f5a"

S = "${WORKDIR}/git"
PIP_INSTALL_PACKAGE = "flake8_requirements"

inherit setuptools3
inherit native

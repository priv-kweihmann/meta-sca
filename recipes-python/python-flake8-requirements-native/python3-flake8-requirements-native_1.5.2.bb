SUMMARY = "Package requirements checker, plugin for flake8"
HOMEPAGE = "https://github.com/Arkq/flake8-requirements"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0ea7a8535b886b84749903b72bb23949"

DEPENDS += "\
            python3-flake8-native \
            python3-toml-native \
            "

SRC_URI = "git://github.com/Arkq/flake8-requirements.git;branch=master;protocol=https"
SRCREV = "084927bac97a5e0539c48d2d591fd4dcfc00c963"

S = "${WORKDIR}/git"
PIP_INSTALL_PACKAGE = "flake8_requirements"

inherit setuptools3
inherit native

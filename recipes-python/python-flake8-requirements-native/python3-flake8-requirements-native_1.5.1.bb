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
SRCREV = "83d9b79c8f7d36cf5c4117ab3398d1f99c7d707b"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

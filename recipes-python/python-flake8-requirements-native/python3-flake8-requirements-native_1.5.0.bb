SUMMARY = "Package requirements checker, plugin for flake8"
HOMEPAGE = "https://github.com/Arkq/flake8-requirements"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0ea7a8535b886b84749903b72bb23949"

DEPENDS += "\
            python3-flake8-native \
            python3-toml-native \
            "

SRC_URI = "git://github.com/Arkq/flake8-requirements.git;protocol=https"
SRCREV = "c29f14c3170c71393cf4ab28d1c504448c11b2bf"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

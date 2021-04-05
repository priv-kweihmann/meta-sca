SUMMARY = "Package requirements checker, plugin for flake8"
HOMEPAGE = "https://github.com/Arkq/flake8-requirements"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f6a7ebcbe234d94509bad74d466632ee"

DEPENDS += "\
            python3-flake8-native \
            python3-toml-native \
            "

SRC_URI = "git://github.com/Arkq/flake8-requirements.git;protocol=https"
SRCREV = "569de73fe7d0f238c5017620e18db0247930b4ee"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native


SUMMARY = "flake8 plugin that integrates isort"
HOMEPAGE = "https://github.com/gforcada/flake8-isort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "\
            python3-flake8-native \
            python3-isort-native \
            python3-testfixtures-native \
            "

SRC_URI = "git://github.com/gforcada/flake8-isort.git;branch=master;protocol=https"
SRCREV = "8d25aab33c972ca362f35e74e3d4bb1d1f670cec"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

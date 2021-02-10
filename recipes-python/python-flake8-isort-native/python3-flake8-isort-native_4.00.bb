
SUMMARY = "flake8 plugin that integrates isort"
HOMEPAGE = "https://github.com/gforcada/flake8-isort"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "\
            python3-flake8-native \
            python3-isort-native \
            python3-testfixtures-native \
            "

SRC_URI = "git://github.com/gforcada/flake8-isort.git;protocol=https"
SRCREV = "acb2bea7e7362e28f9a5c4612d19eaee4142fffb"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

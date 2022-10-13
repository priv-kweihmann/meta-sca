
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
SRCREV = "cfc6c496360b19f1917c2ccd9da1c04f692e80e6"

S = "${WORKDIR}/git"
PIP_INSTALL_PACKAGE = "flake8_isort"

inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-isort \
    nativesdk-python3-testfixtures \
"

SUMMARY = "flake8 plugin for validation of function parameters (length, complexity, etc)"
HOMEPAGE = "https://github.com/best-doctor/flake8-functions"
LICENSE = "MIT"

SRC_URI += "git://github.com/best-doctor/flake8-functions.git;protocol=https"
SRCREV = "ff27f7179a87fe5856d96e9e4d75277fc5e28ca4"
UPSTREAM_CHECK_COMMITS = "1"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"


DEPENDS += "\
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-pytest-native \
            ${PYTHON_PN}-setuptools-native \
            "

inherit native
inherit setuptools3

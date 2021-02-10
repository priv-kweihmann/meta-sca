SUMMARY = "A flake8 extension that helps to make more readable variables names"
HOMEPAGE = "https://github.com/best-doctor/flake8-variables-names"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=352fd8fef192c98968c70971a80f959c"

DEPENDS += "python3-flake8-native"

SRC_URI = "git://github.com/best-doctor/flake8-variables-names.git;protocol=https"
SRCREV = "4412fbc1b558f968cae97e1e7fe671309f697812"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

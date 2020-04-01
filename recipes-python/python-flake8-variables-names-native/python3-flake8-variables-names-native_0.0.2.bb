SUMMARY = "A flake8 extension that helps to make more readable variables names"
HOMEPAGE = "https://github.com/best-doctor/flake8-variables-names"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=352fd8fef192c98968c70971a80f959c"

DEPENDS += "${PYTHON_PN}-flake8-native"

SRC_URI = "git://github.com/best-doctor/flake8-variables-names.git;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3
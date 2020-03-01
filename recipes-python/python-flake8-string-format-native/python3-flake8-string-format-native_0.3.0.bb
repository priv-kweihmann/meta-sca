SUMMARY = "Check that indexed parameters are used in strings"
DESCRIPTION = "Check that indexed parameters are used in strings"
HOMEPAGE = "https://github.com/xZise/flake8-string-format"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=251fb17d242c0c87600c78fa66192abf"

SRC_URI = "git://github.com/xZise/flake8-string-format.git;protocol=https;tag=${PV}"
S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit native
inherit setuptools3

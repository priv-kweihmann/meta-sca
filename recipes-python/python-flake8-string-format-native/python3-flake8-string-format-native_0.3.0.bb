SUMMARY = "Check that indexed parameters are used in strings"
HOMEPAGE = "https://github.com/xZise/flake8-string-format"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=251fb17d242c0c87600c78fa66192abf"

DEPENDS += "python3-flake8-native"

SRC_URI = "git://github.com/xZise/flake8-string-format.git;branch=master;protocol=https"
SRCREV = "356b9109f1e2ce6ae9f8179a52f1f909f99a9eb8"
S = "${WORKDIR}/git"

PIP_INSTALL_PACKAGE = "flake8_string_format"

inherit setuptools3
inherit native

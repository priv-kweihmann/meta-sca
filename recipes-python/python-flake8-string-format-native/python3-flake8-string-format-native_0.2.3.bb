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

SRC_URI[md5sum] = "1e2077e6c14598af97e321213484a595"
SRC_URI[sha256sum] = "774d56103d9242ed968897455ef49b7d6de272000cfa83de5814273a868832f1"

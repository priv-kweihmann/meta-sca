SUMMARY = "Flake8 extension to validate (lack of) logging format strings"
HOMEPAGE = "https://github.com/globality-corp/flake8-logging-format"

SRC_URI = "git://github.com/globality-corp/flake8-logging-format.git;protocol=https;tag=${PV}"
S = "${WORKDIR}/git"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

PYPI_PACKAGE = "flake8-logging-format"

DEPENDS += "${PYTHON_PN}-nose-native"

inherit native
inherit setuptools3

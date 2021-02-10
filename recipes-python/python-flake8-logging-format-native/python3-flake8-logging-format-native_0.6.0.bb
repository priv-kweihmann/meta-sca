SUMMARY = "Flake8 extension to validate (lack of) logging format strings"
HOMEPAGE = "https://github.com/globality-corp/flake8-logging-format"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS += "python3-nose-native"

SRC_URI = "git://github.com/globality-corp/flake8-logging-format.git;protocol=https"
SRCREV = "b2946e3f81b9274e59baf427400b6f9801b1d9ee"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

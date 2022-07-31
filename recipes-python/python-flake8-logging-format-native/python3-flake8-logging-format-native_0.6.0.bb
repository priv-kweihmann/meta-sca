SUMMARY = "Flake8 extension to validate (lack of) logging format strings"
HOMEPAGE = "https://github.com/globality-corp/flake8-logging-format"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/globality-corp/flake8-logging-format.git;branch=master;protocol=https \
           file://0001-Remove-hard-dependency-on-nose.patch \
          "
SRCREV = "b2946e3f81b9274e59baf427400b6f9801b1d9ee"

S = "${WORKDIR}/git"
PIP_INSTALL_PACKAGE = "flake8_logging_format"

inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"

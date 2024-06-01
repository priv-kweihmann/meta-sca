SUMMARY = "Flake8 extension to validate (lack of) logging format strings"
HOMEPAGE = "https://github.com/globality-corp/flake8-logging-format"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/globality-corp/flake8-logging-format.git;branch=master;protocol=https"
SRCREV = "b7da42d1593ca19c5390be1e710439d0c45099ac"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"

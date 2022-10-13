SUMMARY = "Flake8 extension to validate (lack of) logging format strings"
HOMEPAGE = "https://github.com/globality-corp/flake8-logging-format"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/globality-corp/flake8-logging-format.git;branch=master;protocol=https"
SRCREV = "8074ca77b0cc9f383b4f8ad37a2dbad9b49b8f63"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"

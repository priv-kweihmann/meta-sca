SUMMARY = "flake8 plugin to validate annotations complexity"
HOMEPAGE = "https://github.com/best-doctor/flake8-annotations-complexity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"

PV = "0.0.6+${SRCREV}"

SRC_URI = "git://github.com/best-doctor/flake8-annotations-complexity.git;branch=master;protocol=https"
SRCREV = "2080fe13950f8c3f2bff1197a4e4dafa9ab4bd6d"

UPSTREAM_CHECK_COMMITS = "1"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"

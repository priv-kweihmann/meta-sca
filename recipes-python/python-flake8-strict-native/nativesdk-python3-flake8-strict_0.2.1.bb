SUMMARY = "Flake8 plugin that checks Python code against a set of opinionated style rules"
HOMEPAGE = "https://github.com/smarkets/flake8-strict"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6ceb86d5d9e2cc99e949bd8ec58dba3"

DEPENDS += "\
    nativesdk-python3-black \
    nativesdk-python3-enum-compat \
    nativesdk-python3-flake8 \
"

SRC_URI = "git://github.com/smarkets/flake8-strict.git;branch=master;protocol=https"
SRCREV = "7c40ad30ecb6d8a31ac384ed49bb8107cfd5023e"
UPSTREAM_CHECK_COMMITS = "1"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"
PIP_INSTALL_PACKAGE = "flake8_strict"

inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-black \
    nativesdk-python3-core \
    nativesdk-python3-enum-compat \
    nativesdk-python3-flake8 \
"

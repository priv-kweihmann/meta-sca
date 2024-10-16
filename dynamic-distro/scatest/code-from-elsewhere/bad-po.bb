SUMMARY = "Bad po test files (based on msgcheck tests)"
HOMEPAGE = "https://github.com/flashcode/msgcheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"

LIC_FILES_CHKSUM = "file://${UNPACKDIR}/git/LICENSE.txt;md5=c678957b0c8e964aa6c70fd77641a71e"

SRC_URI = "git://github.com/flashcode/msgcheck.git;branch=main;protocol=https"
SRCREV = "08eb80622a5dedf4739c3942b3c22e7ed33d3507"
UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git/tests"

inherit sca

SCA_ENABLED_MODULES = "bitbake dennis msgcheck"

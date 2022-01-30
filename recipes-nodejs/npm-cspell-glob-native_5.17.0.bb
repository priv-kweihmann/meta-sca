SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.17.0.tgz"
SRC_URI[md5sum] = "43dc8f9098d24974a85bc83f9bc71d36"
SRC_URI[sha256sum] = "4cfccee504e1220b0280a07eac9b3b632748f18d650faaf19833e2a57f2065bf"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

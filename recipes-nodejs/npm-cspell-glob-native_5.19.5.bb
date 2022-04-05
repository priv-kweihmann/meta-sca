SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.19.5.tgz"
SRC_URI[md5sum] = "f249060e2479da0f61e95421190a0b08"
SRC_URI[sha256sum] = "457929ef4405e016fb0ebd78fe75d6f824f9baafe3d8815abf7bcfc33830dcee"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

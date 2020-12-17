SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.0.8.tgz"
SRC_URI[md5sum] = "6f6776954883d3aea01dcd48b0041fbc"
SRC_URI[sha256sum] = "2728bad2746e77f101d713c5dd44fa0373abe064e6be9edd8eaa4fcfe4e6f80d"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

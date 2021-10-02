SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.11.1.tgz"
SRC_URI[md5sum] = "096cac7923daefcbb76fae949019b769"
SRC_URI[sha256sum] = "3f7533c8c162745c6b13b5e4e34b5ac0aa0017eb99bde413e8051921717e4378"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.15.2.tgz"
SRC_URI[md5sum] = "988a51350e197278626d7018926f6bbc"
SRC_URI[sha256sum] = "63ac5ebf117e7520c1314ea3131a94faf40ae98bfb6d066e8532e271c025b8b9"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

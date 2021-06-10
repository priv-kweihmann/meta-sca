SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.6.1.tgz"
SRC_URI[md5sum] = "83f212aba0a3c63f8efe847e6e45728e"
SRC_URI[sha256sum] = "2ed92c721a3c1539982602a1d56e2ddfcdface76cfd433ce0fc1dcfba3f9b533"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.3.5.tgz"
SRC_URI[md5sum] = "2163b1de51667d9863aab6906610df13"
SRC_URI[sha256sum] = "22ae36a9fcf31f928cfea66fdea4d6ef66b83f62533fbbdd0a6bca8b29022785"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

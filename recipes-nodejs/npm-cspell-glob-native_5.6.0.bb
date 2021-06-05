SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.6.0.tgz"
SRC_URI[md5sum] = "5d659a670928f8225b5d7732667e2939"
SRC_URI[sha256sum] = "c25d11d3d845f930fe14a4908252aa0c3252b4becd39ad288c8c996666069a05"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

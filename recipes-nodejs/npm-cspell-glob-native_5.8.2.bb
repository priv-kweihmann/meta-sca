SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.8.2.tgz"
SRC_URI[md5sum] = "1f5f97afd0cca64a929c3a88c34b95b3"
SRC_URI[sha256sum] = "6a68817cdfa1533de6994f9acb2b15c99710b1b5de16b69144f88dcdea20c417"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

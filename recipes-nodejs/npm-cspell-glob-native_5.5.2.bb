SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.5.2.tgz"
SRC_URI[md5sum] = "9e98bf7444e1788983b0e5c91f2a1f5a"
SRC_URI[sha256sum] = "aae1514e9be625548bb45c94462e896a4a920df940ffbb2e16e9bdf37e607231"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

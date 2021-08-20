SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.7.0.tgz"
SRC_URI[md5sum] = "f0048c23a68dc7e39a18baee76ab3929"
SRC_URI[sha256sum] = "c130aa823cfe072e4bf53b1444ce7d2681adaa997201f97b05b76f2240cb7478"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

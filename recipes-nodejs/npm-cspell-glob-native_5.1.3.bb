SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.1.3.tgz"
SRC_URI[md5sum] = "7774ba91d0f63c526a7679e6d979e3d6"
SRC_URI[sha256sum] = "884078f6dbfd45417032b45cc2446f54423198e01755dd704de4a9aa22e65579"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

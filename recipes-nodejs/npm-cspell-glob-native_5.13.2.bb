SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.13.2.tgz"
SRC_URI[md5sum] = "fc9810e5ecce51605fda802a152e3014"
SRC_URI[sha256sum] = "4a1eded55923cc4f7c4dab6ac432bf4f2d19d407e8600647620c50059b1fe6a9"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

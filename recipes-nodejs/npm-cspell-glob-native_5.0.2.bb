SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.0.2.tgz"
SRC_URI[md5sum] = "adc2a3fe121f983942cefe842d7eeeb7"
SRC_URI[sha256sum] = "6b81180c2232303f7e28be3cd30c880539dbd69a2f44a1b525b7e6efb34e9716"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

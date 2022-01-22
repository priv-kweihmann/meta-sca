SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.16.0.tgz"
SRC_URI[md5sum] = "6b151dfc9105e9030744aba742b1b1bc"
SRC_URI[sha256sum] = "5cc32872763dd4bf1b358bdfe4030f5243a1f10deb8e67ef63dbcf85fa5c991f"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

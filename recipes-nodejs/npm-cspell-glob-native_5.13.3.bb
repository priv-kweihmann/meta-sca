SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.13.3.tgz"
SRC_URI[md5sum] = "768b951d5e24c111d664bc99e5777091"
SRC_URI[sha256sum] = "3fa024ee191c4421f19a14e4c42c140de404c4b4a72ecfac3aa4e0b0460dcfc9"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

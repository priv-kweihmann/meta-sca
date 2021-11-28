SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.13.1.tgz"
SRC_URI[md5sum] = "8e5870c3329c6f2f184609516fc0094c"
SRC_URI[sha256sum] = "fb4d8829760299903e557026e45caeca6f46e933342e2f855acefddc48518bf7"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

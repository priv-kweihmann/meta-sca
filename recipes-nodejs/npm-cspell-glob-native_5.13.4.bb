SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.13.4.tgz"
SRC_URI[md5sum] = "4c1e7058659fa77bc5e6a719bdd072f7"
SRC_URI[sha256sum] = "9167ab3693c1cff3715298a0a78d5bc12f4262aaa01103907a2cc4b5bf2843c4"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

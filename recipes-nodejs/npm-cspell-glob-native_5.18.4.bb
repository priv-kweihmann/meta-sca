SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.18.4.tgz"
SRC_URI[md5sum] = "b486b81c3202c34e4d4a2afc7b8913ec"
SRC_URI[sha256sum] = "cfc7224c3582a61216b74301e93921c288c83e9ff6005fbd70eda6b9b6b3bd2e"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

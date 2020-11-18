SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-0.1.25.tgz"
SRC_URI[md5sum] = "040e391919747912e3b0fd6455b3e3fe"
SRC_URI[sha256sum] = "71e21b9e61dbc6710faa5b579cfacb3ab3d391d4f3710cf0b3d0450fb72ab7d0"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

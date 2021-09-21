SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.10.0.tgz"
SRC_URI[md5sum] = "cdc11a37d60102203907b5bda0f5f2b0"
SRC_URI[sha256sum] = "85e51c3d3c22650ee7913a12ce3a10a8d6a1b9a146fb9ec8ca9104b97b0c9106"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

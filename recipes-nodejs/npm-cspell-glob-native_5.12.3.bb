SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.12.3.tgz"
SRC_URI[md5sum] = "700d668fdb88df9fd02aaf26e6340834"
SRC_URI[sha256sum] = "05236e93481f04d67d8f118cfc83ca79d363ff5f0d387f1e82bb5d7b006bcaa9"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

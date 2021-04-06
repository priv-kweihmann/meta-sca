SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.3.12.tgz"
SRC_URI[md5sum] = "b1a5c3427ba56cafd3f9ecc2d4f5543f"
SRC_URI[sha256sum] = "6efcbb30b54c56d690ed66d492975c3c9dfbbe076ba4328d7e955f12e58974e7"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native

SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fs-extra-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-minimatch-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.2.3.tgz"
SRC_URI[md5sum] = "d7940eb63318ab12af41fc75827f0709"
SRC_URI[sha256sum] = "275ebb1b929d08e8d8f36778c280ce1463c85b61e63b7d781ca3c0cceb1d66d8"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

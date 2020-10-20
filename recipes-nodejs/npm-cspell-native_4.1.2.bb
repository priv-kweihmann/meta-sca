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
           npm-gensequence-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-4.1.2.tgz"
SRC_URI[md5sum] = "459aba0e898cf80c91376e4c35f05836"
SRC_URI[sha256sum] = "da6f8602e04c53b0fac685016bf1bb75d5a638f2a9d07ea97432abbe4407e50a"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-4.1.3.tgz"
SRC_URI[md5sum] = "e045d6250a9f2fcf7627f1b496fab6fe"
SRC_URI[sha256sum] = "e0da420fe5c74f05de6107371faeced81df123c7b58bb29a9ff9515ac4ca69c8"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

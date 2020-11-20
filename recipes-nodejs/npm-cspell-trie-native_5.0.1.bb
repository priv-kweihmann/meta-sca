SUMMARY = "NPM: cspell-trie"
DESCRIPTION = "Trie Data Structure reader for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-commander-native \
           npm-cspell-trie-lib-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-5.0.1.tgz"
SRC_URI[md5sum] = "3332f76f897fa350c15f6923477fb0d0"
SRC_URI[sha256sum] = "e9db5ee0933ed5d7b131d87a40a0ccf6879daf215d9a739c92eac049057908ab"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

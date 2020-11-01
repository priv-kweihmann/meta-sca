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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-4.2.2.tgz"
SRC_URI[md5sum] = "0441bd4cef3982d695a80cde371768f1"
SRC_URI[sha256sum] = "ad5212ab4e1af4bd39e6098b261b12b303a0975fa3ffc4d6c554b493d2f70ffb"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

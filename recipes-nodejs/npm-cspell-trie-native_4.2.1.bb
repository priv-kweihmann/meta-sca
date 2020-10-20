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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-4.2.1.tgz"
SRC_URI[md5sum] = "c1ad664f5d7dd14aa73f1ed29418d2ac"
SRC_URI[sha256sum] = "15df40be0d239ef120297ecea2918ab9888da9ee1ff1db7b9bdf5498820666a0"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

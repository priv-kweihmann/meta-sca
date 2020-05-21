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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-4.1.11.tgz"
SRC_URI[md5sum] = "2dc7824b2da4d1013ae6ed8da4022969"
SRC_URI[sha256sum] = "11153de81837a72ffd2f7269a9693e7652ad03bd1089074190638c8e320b3a8b"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

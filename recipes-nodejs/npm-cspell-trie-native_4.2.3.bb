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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-4.2.3.tgz"
SRC_URI[md5sum] = "be867fd0c528b4f4f867afbd189b001b"
SRC_URI[sha256sum] = "b9886178b3e721d419ca6e022af1270c35fb9cea2f5ab31b947190ba6df112cb"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

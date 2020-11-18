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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-4.2.7.tgz"
SRC_URI[md5sum] = "969ef2d5aa4ff8ba54b57e8c70a95b75"
SRC_URI[sha256sum] = "3bd52c5fa706201a4ba4f4f8a7b1306704a726c87ab170e47a9ed7bff11798f8"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

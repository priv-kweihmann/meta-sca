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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-5.0.3.tgz"
SRC_URI[md5sum] = "03f97fcc5558be7b74a82b3e6a1847be"
SRC_URI[sha256sum] = "59ecbb31401a80c3aa51bbc585ab45221b3f0711ea780f890e424bcd5a11c53b"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

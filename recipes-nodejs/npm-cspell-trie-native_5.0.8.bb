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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-5.0.8.tgz"
SRC_URI[md5sum] = "7afbfb2569441bb36998386427e1f5df"
SRC_URI[sha256sum] = "bc9c1ecbe2693ed48d0930b922637da2efa6e0c3f4cd0ae8dc3324caea695b48"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

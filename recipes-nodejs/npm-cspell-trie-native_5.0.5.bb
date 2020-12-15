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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-5.0.5.tgz"
SRC_URI[md5sum] = "dc5623501fe5375c15ca2824498ab695"
SRC_URI[sha256sum] = "f09c1d7d42737d38e3e72506479f3ddac926ccc5e26c93207e6ad1668ea51f22"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

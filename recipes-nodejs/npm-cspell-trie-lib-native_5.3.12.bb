SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.3.12.tgz"
SRC_URI[md5sum] = "23f3c57dbf909d1d345291d2d337946d"
SRC_URI[sha256sum] = "813eab339bb40d43d15cf0962532e390fce8e859d37ae469a908cd0988830ed4"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

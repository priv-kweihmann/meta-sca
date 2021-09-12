SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.9.1.tgz"
SRC_URI[md5sum] = "91a784010c1fb9b1b7828a011d2609c4"
SRC_URI[sha256sum] = "08ec56c6441e0d703ccc21c9ade67a25d0a4a78b7d23174416a35e8c869aeb47"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

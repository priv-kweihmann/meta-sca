SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.4.0.tgz"
SRC_URI[md5sum] = "2900ca063fde99b3bb854af93a32338e"
SRC_URI[sha256sum] = "b75359959d298f6a511ba2d29f911e32ca97cbc2ed18eb9f3f9216f5b53b4f35"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

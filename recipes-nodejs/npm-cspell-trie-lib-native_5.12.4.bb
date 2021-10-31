SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.12.4.tgz"
SRC_URI[md5sum] = "46f964f7dab4720c615117df2d50d017"
SRC_URI[sha256sum] = "85f6e2ca9d1e31f2898a7f13a785d16da4db4acd72eea08187493abd86ea1080"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

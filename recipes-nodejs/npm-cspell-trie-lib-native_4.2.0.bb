SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-4.2.0.tgz"
SRC_URI[md5sum] = "6be10c1f0643f99ea215c05aba58f448"
SRC_URI[sha256sum] = "2336e48db3d8e2b1bfcc025a61a512b1c7120c590ce789e7431a82ae881412f0"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

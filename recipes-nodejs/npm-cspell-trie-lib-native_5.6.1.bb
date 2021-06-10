SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.6.1.tgz"
SRC_URI[md5sum] = "a461d646623aa988fdf29752d1c53f82"
SRC_URI[sha256sum] = "37cb58e97f9172f7a412187f11dc2aba3d022d1cad7a1398e9c7786ad5793c62"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

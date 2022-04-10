SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-cspell-pipe-native \
           npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.19.7.tgz"
SRC_URI[md5sum] = "42ae2b1b120105cd7e38e73eb1d249cb"
SRC_URI[sha256sum] = "24baef6c3607ce25534378c38b760cf59bba6e13e0a215234ad7e6d82245cfb5"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

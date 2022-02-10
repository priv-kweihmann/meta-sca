SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-cspell-pipe-native \
           npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.18.4.tgz"
SRC_URI[md5sum] = "f91b52ea127ecb41768f2e26ff53996c"
SRC_URI[sha256sum] = "e1b1d94f8ead9bf1677310dbedf6d71cac9b9b24cca85db2447e6995e4b2a288"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

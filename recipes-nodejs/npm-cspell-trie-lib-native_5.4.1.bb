SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.4.1.tgz"
SRC_URI[md5sum] = "5e804767be4ed11b715143e44091ca88"
SRC_URI[sha256sum] = "487299e61f390e3dadd3b45beea816abdf32f38741af05633950d71fde152b2d"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

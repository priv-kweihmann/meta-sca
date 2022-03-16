SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-cspell-pipe-native \
           npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.19.2.tgz"
SRC_URI[md5sum] = "ddb07b27f4b9f0aafd4f51b70848a47c"
SRC_URI[sha256sum] = "1ee5239c62ab6767d796512479701a73d03f641bb645e860a5b6ac8a6bf2e252"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

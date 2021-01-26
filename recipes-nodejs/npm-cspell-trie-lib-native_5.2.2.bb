SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.2.2.tgz"
SRC_URI[md5sum] = "f83fee303c039939ec5936da5414c334"
SRC_URI[sha256sum] = "97bdb2191210b2ca7f33c14eb3a31d759a2d40fb7607f8b3e6d15b6ebdd02ceb"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

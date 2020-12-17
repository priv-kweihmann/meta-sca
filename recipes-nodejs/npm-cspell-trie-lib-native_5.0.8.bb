SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.0.8.tgz"
SRC_URI[md5sum] = "c5e77c5e8faad6ee2efb859d787775f2"
SRC_URI[sha256sum] = "cf14060252b7b748d1bb33a66ebe241d47b42bce83c7dcef082792db8551c7bb"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

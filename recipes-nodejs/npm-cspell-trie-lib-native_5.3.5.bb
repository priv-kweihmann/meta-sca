SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.3.5.tgz"
SRC_URI[md5sum] = "0550d84b1a45170da74a66297a252004"
SRC_URI[sha256sum] = "fb68c11de9152a39cabe13a3be2f58b30ac88d74b6c75f6bbcfb2c65d933e529"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

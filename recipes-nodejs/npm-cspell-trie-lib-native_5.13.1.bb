SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.13.1.tgz"
SRC_URI[md5sum] = "e537b8e71612843d9ed79723db7dad41"
SRC_URI[sha256sum] = "52b528520bcfcc0bf47de31510a0191a1500cd84423c285d2916556ef079327b"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

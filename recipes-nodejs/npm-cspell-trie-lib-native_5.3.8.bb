SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.3.8.tgz"
SRC_URI[md5sum] = "60bcbed407e1c568bf5815c0b8e27b5b"
SRC_URI[sha256sum] = "d2c8648053cb627c7ed604425c2fc3c0a7d9dc94461fd9b7fa7c1b9542528755"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

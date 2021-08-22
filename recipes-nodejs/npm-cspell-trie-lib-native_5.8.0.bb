SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.8.0.tgz"
SRC_URI[md5sum] = "6d8071253546c9681485ef750ca8bd66"
SRC_URI[sha256sum] = "68e2f4e8617a100d7c050d357472582cd782c827ebb8f16d2fdc09b1a0babd31"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

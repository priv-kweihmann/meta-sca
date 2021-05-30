SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.5.2.tgz"
SRC_URI[md5sum] = "0c9a3cc153a39eb3c14aa3c0cba39c41"
SRC_URI[sha256sum] = "1ee7edcfb465a603dcf6277a46eea552c5d71c77022a831bce1821f96398afce"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

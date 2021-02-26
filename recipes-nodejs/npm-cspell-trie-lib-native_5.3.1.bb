SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.3.1.tgz"
SRC_URI[md5sum] = "6f1ce5a0d2fc218923c770b8e41c443b"
SRC_URI[sha256sum] = "e5244ede691da85d66bbd1b4ded16845393627a0e9c3f9403297bf55944d2e48"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

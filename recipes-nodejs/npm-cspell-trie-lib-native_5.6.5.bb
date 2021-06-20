SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.6.5.tgz"
SRC_URI[md5sum] = "a01958b540efb3fc8c5d73e2c0dfa2ea"
SRC_URI[sha256sum] = "f48c2b9e46dcaeb00babdc99c78c3aa66a5607eca03e5f043a43297d81248648"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

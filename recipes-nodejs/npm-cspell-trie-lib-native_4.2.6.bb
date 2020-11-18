SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-4.2.6.tgz"
SRC_URI[md5sum] = "21f31ce1ddf77a0cc95ffefd3ebe3c7a"
SRC_URI[sha256sum] = "22f575533195e01b3521d0abd8d5603d3b4cbcdbb6f576137eeaa16685c60b69"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

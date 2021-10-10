SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.12.3.tgz"
SRC_URI[md5sum] = "b64557baf9c502681edbf821c5621c1b"
SRC_URI[sha256sum] = "2ad2d77ec01ab9dcbc6cef0f7d813dafa5b391cd8dfae02336b33c75f014b201"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

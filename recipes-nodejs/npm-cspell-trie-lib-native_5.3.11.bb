SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.3.11.tgz"
SRC_URI[md5sum] = "8e01c5d82c1e51e381ffc130b077c205"
SRC_URI[sha256sum] = "ac66f43113fc8a7c4eef689836f0de8cc655fdaccbf0fdb746beba05adad4d07"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.0.1.tgz"
SRC_URI[md5sum] = "b24b2f248b91628a055354c8bb4faeaf"
SRC_URI[sha256sum] = "7f854d3b98e6b8c20e71c01e6ef25008ca203b1ea93edaee7077218809343eae"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-4.2.2.tgz"
SRC_URI[md5sum] = "c250e8b37490fb1732595487ffb993ae"
SRC_URI[sha256sum] = "666ff9d41956a35f177628e2fcba0c757a8c48d14711b2950b2e9a2db59375b8"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

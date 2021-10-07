SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.12.2.tgz"
SRC_URI[md5sum] = "081e65913944328f80ad43a6f0ac5a23"
SRC_URI[sha256sum] = "208cd4d3d9dc2a14e02f59a157517ca2fd4d0f511330ecc7f37cacc441a64880"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

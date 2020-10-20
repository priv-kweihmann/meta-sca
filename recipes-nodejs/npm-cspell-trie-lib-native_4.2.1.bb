SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-4.2.1.tgz"
SRC_URI[md5sum] = "ded82ee141aee1cd94089c0e06aadc84"
SRC_URI[sha256sum] = "1070344806a6e13caf67c2be3d7a22e7500b4036c9bd03050ecfe7bf6d2fdd8f"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

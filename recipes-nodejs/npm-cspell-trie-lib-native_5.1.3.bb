SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.1.3.tgz"
SRC_URI[md5sum] = "6b040dd01ea2d47767bae4f6f8bf0f18"
SRC_URI[sha256sum] = "233cec678f2243624242cd7553d598569a7449f6f3d083db35e06117f8690bfb"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

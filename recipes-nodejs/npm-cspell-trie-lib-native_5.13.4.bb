SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.13.4.tgz"
SRC_URI[md5sum] = "71aaabda89873f9c8b9dec3e54eda879"
SRC_URI[sha256sum] = "555d422378ecd2c64b300aacfadb147954c6262771452560f9f2eb7ef9190e17"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

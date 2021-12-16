SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.13.3.tgz"
SRC_URI[md5sum] = "4c135d8bf071fc16a3d15181d79a150f"
SRC_URI[sha256sum] = "cdd9cc32f897a75e25bc93fb9ee545e638a4b60a770578818f367bde54812088"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

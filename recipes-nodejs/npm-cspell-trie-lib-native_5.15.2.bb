SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.15.2.tgz"
SRC_URI[md5sum] = "539ea72b90cd0f84f272cd1eacb5a0c4"
SRC_URI[sha256sum] = "222970ffc8e337c56313fb8865cc4571a2e32350b1101d27334ab3ed4a5f252e"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

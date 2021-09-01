SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.9.0.tgz"
SRC_URI[md5sum] = "2b874cf5962d285eddc6cbd7b6271a76"
SRC_URI[sha256sum] = "aa0ca8beba261bc4d875b9f361a30efe8a2931dc0b4c3bb1e65b6ccf2c7e2cdc"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.11.1.tgz"
SRC_URI[md5sum] = "830f658b78f4e88067879a37a9fec3a9"
SRC_URI[sha256sum] = "b86720f350b0681e535f86a77e68110ddb15cfa657c78a3ac59520921e5fd5e2"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

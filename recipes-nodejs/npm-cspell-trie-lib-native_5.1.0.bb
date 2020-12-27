SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.1.0.tgz"
SRC_URI[md5sum] = "b96f720f1d34025685f22c646e413b7d"
SRC_URI[sha256sum] = "dda9e71825cc2ede29f3bb5fa0aab96ce7584cadafb7d909b091531cbc02b9a8"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

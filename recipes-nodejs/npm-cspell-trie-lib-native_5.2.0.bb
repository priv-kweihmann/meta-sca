SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.2.0.tgz"
SRC_URI[md5sum] = "9c7d97e14a81d4aa23ff91219fda018f"
SRC_URI[sha256sum] = "5d140428cfda32c4031f94f5f8787358114423da1904f1df104ebba5c5d32b35"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-4.1.10.tgz"
SRC_URI[md5sum] = "84872a15914f165fb68b8d5260415476"
SRC_URI[sha256sum] = "d8ba962a402c0fe2f2e7099754bc0c505b9cba47d625fbd1fb0ba25ae53d57ce"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

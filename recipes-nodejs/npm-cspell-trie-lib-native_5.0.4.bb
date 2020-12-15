SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.0.4.tgz"
SRC_URI[md5sum] = "dab0b09b10139fcec7152bdbb4ed3ab7"
SRC_URI[sha256sum] = "e5dcacd58968f578f438359753ed235c4cdb270c45c512240ee9312ecd5e16db"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

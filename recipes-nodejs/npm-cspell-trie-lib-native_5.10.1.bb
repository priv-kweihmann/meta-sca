SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.10.1.tgz"
SRC_URI[md5sum] = "768bd3b706fdc96d4068049c5d1f2e9f"
SRC_URI[sha256sum] = "3044d7a9ce870297e690e07b0e20c17d54eabc2660691fccea644693d0d9fff9"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

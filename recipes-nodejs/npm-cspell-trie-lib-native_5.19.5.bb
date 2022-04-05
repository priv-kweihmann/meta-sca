SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-cspell-pipe-native \
           npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.19.5.tgz"
SRC_URI[md5sum] = "036632718e57cdf4b3a39af63978b823"
SRC_URI[sha256sum] = "b1189867d31895e58dddc099f7593907354635c19add0deb2ca74f46a53f59c7"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

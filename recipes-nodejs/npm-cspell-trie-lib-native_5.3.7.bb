SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.3.7.tgz"
SRC_URI[md5sum] = "693e1caf715007e40256f9e5926cd7f9"
SRC_URI[sha256sum] = "aff37e5b7fb76a47ad50597ae8ffc7aa3ddf17d0478abdfdaf3054a0cac920ee"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

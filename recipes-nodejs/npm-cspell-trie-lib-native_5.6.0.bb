SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.6.0.tgz"
SRC_URI[md5sum] = "85b43927d36bc198368ea7c530715b29"
SRC_URI[sha256sum] = "c78db86bd01347e9df90964d93a86a76fe2681e0ca9f9e017d65bbcb8bf2936b"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

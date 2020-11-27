SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.0.2.tgz"
SRC_URI[md5sum] = "ca81247f23016dab70cf5cab4aa704c4"
SRC_URI[sha256sum] = "a69021e6525a1e637e68c14ceb3e8e7cbd13a3defe98186488eb6bc9201e8960"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

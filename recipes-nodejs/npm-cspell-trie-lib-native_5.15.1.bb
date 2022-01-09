SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.15.1.tgz"
SRC_URI[md5sum] = "b460d03d8997db47e5bed24f16452cb9"
SRC_URI[sha256sum] = "cab703cf3ef4d2f7c4ef305d98fbcf18d95615d064362a073d3fec123b9bb7e1"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

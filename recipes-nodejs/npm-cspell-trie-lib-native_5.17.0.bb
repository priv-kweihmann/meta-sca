SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.17.0.tgz"
SRC_URI[md5sum] = "0aa0cc7343946abf5a96dec78591876e"
SRC_URI[sha256sum] = "ba006184e9682a31fe0036508174d5932a0eb1875d5bc29427748bc75448e680"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

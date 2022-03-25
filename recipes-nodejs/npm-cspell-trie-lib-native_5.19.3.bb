SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-cspell-pipe-native \
           npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.19.3.tgz"
SRC_URI[md5sum] = "cf310032c2753c4a41897cfed504fbd0"
SRC_URI[sha256sum] = "701f546cd630165956dc8631ddf48b7b093abe6c90ba8ef717d9c7cc3b0d35ba"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

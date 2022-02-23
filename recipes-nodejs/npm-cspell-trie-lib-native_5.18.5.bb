SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-cspell-pipe-native \
           npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.18.5.tgz"
SRC_URI[md5sum] = "a4e5876fc3e608df3dac1b20cf3ee4ca"
SRC_URI[sha256sum] = "b9d0aa005c0c41abd973758ea36815df7cfc24950c383bcbd23ccb54a68c5fb9"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

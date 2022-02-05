SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-cspell-pipe-native \
           npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.18.3.tgz"
SRC_URI[md5sum] = "b3ab928ce21b64956ed922890aed7a72"
SRC_URI[sha256sum] = "047889f004760c5588485bb026ce5dc5de52dc9991a02ec5b697e8f5f5e71375"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

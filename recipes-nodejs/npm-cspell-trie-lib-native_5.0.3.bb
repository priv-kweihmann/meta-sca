SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.0.3.tgz"
SRC_URI[md5sum] = "d71b46fbe9a782b3eb27936e87045d6d"
SRC_URI[sha256sum] = "ef9094582ea6e5419bf962bbcc6444387e64f531f32417041b2087f36864924d"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

SUMMARY = "NPM: cspell-trie-lib"
DESCRIPTION = "Trie Data Structure to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-fs-extra-native \
           npm-gensequence-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie-lib/-/cspell-trie-lib-5.6.4.tgz"
SRC_URI[md5sum] = "7dc24199a0fd4f1ac1d84680ac615389"
SRC_URI[sha256sum] = "81f70c1b0823ff4f0e263b48b493deaebdafa5c4fa50fafcf273cf23548f2e43"

NPM_PKGNAME = "cspell-trie-lib"

inherit npmhelper
inherit native

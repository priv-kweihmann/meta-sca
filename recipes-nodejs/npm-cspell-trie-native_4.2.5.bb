SUMMARY = "NPM: cspell-trie"
DESCRIPTION = "Trie Data Structure reader for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-commander-native \
           npm-cspell-trie-lib-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-4.2.5.tgz"
SRC_URI[md5sum] = "cddc12256359512709490866423a3371"
SRC_URI[sha256sum] = "5125a18eae201007758d31110bacc7202c7987be92a0a2255e4dc279d7cb5828"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

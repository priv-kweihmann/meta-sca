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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-4.2.0.tgz"
SRC_URI[md5sum] = "c95f08b4b0985c6002590356c91f05d1"
SRC_URI[sha256sum] = "0b8a5c71dc49d420c22a663c542891d7ac444405578c7125e647765725599a3b"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

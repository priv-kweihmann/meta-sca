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

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-5.0.2.tgz"
SRC_URI[md5sum] = "35a7b37ba47853dc87b004b545113908"
SRC_URI[sha256sum] = "78629c1e599357363c5b56bca55b79655210147a3080a5e14bf777f43cd6bed8"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

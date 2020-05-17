SUMMARY = "NPM: cspell-trie"
DESCRIPTION = "Trie Data Structure and tools to support cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

DEPENDS = "npm-commander-native npm-cspell-lib-native npm-fs-extra-native npm-gensequence-native npm-hunspell-reader-native npm-js-xxhash-native npm-rxjs-native npm-rxjs-stream-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

SRC_URI = "https://registry.npmjs.org/cspell-trie/-/cspell-trie-3.0.10.tgz"
SRC_URI[md5sum] = "a29cb47a468206cda441375a237ec1b2"
SRC_URI[sha256sum] = "652ddaf69f5a13777541a0f66def4f57fc9a7496f70574dcaacfb0aefd1a7f3d"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-trie"

inherit npmhelper
inherit native

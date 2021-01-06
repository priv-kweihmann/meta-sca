SUMMARY = "NPM: cspell-lib"
DESCRIPTION = "A library of useful functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-comment-json-native \
           npm-configstore-native \
           npm-cspell-cspell-bundled-dicts-native \
           npm-cspell-io-native \
           npm-cspell-trie-lib-native \
           npm-cspell-util-bundle-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-minimatch-native \
           npm-resolve-from-native \
           npm-resolve-global-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.1.3.tgz"
SRC_URI[md5sum] = "bebdfa1bead0a780491da999dc706896"
SRC_URI[sha256sum] = "576455e49bb0c03db78ce7b1c61c3988009cdcae5fc204470bd65c0103eede62"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native

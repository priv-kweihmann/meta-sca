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

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.0.8.tgz"
SRC_URI[md5sum] = "b7fb4d82ca68ca0834fb78911215ba09"
SRC_URI[sha256sum] = "305eb5dd673e26419438b3bf2e44a73d153f87ed36a12365b1a704a1c28d9371"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native

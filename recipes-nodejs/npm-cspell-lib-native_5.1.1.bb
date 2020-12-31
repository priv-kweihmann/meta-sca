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

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.1.1.tgz"
SRC_URI[md5sum] = "f13596cfa4d106f9b7272649dd8b93c1"
SRC_URI[sha256sum] = "2c5d605f7e0e2e7e25d17aa7b372968d7d708a0dcb028ce336869bfc06bbd073"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native

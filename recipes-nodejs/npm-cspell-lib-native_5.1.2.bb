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

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.1.2.tgz"
SRC_URI[md5sum] = "4f59bb9d059f908cb0e28560a6fdf401"
SRC_URI[sha256sum] = "20b94c7b23bbc2deec1e635e42222f0242dca33fc92c9d675ac98c9a48fbb951"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native

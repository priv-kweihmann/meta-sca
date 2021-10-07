SUMMARY = "NPM: cspell-lib"
DESCRIPTION = "A library of useful functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-clear-module-native \
           npm-comment-json-native \
           npm-configstore-native \
           npm-cosmiconfig-native \
           npm-cspell-cspell-bundled-dicts-native \
           npm-cspell-cspell-types-native \
           npm-cspell-glob-native \
           npm-cspell-io-native \
           npm-cspell-trie-lib-native \
           npm-find-up-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-import-fresh-native \
           npm-resolve-from-native \
           npm-resolve-global-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.12.2.tgz"
SRC_URI[md5sum] = "2483e09f389164c96e9976659703becf"
SRC_URI[sha256sum] = "7ca483524c876b7b2d24c3f202700e43e71238559a37e2933bc2253923bcf76c"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native

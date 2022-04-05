SUMMARY = "NPM: cspell-lib"
DESCRIPTION = "A library of useful functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-clear-module-native \
           npm-comment-json-native \
           npm-configstore-native \
           npm-cosmiconfig-native \
           npm-cspell-cspell-bundled-dicts-native \
           npm-cspell-cspell-pipe-native \
           npm-cspell-cspell-types-native \
           npm-cspell-glob-native \
           npm-cspell-io-native \
           npm-cspell-trie-lib-native \
           npm-fast-equals-native \
           npm-find-up-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-import-fresh-native \
           npm-resolve-from-native \
           npm-resolve-global-native \
           npm-vscode-languageserver-textdocument-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.19.5.tgz"
SRC_URI[md5sum] = "d10f9380babdb80c8c9ef9fffbda6539"
SRC_URI[sha256sum] = "9bec00330d515ddef166571992dd95bf872cc065f8bc47c4eede0869588a99b9"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native

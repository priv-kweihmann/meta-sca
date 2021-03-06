SUMMARY = "NPM: cspell-lib"
DESCRIPTION = "A library of useful functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-comment-json-native \
           npm-configstore-native \
           npm-cosmiconfig-native \
           npm-cspell-cspell-bundled-dicts-native \
           npm-cspell-cspell-types-native \
           npm-cspell-glob-native \
           npm-cspell-io-native \
           npm-cspell-trie-lib-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-resolve-from-native \
           npm-resolve-global-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.3.7.tgz"
SRC_URI[md5sum] = "da62689454c22e06c7521e215ef1f267"
SRC_URI[sha256sum] = "8fa29a3924f12a930dcaa09338681815f4f340ff8f4d97c1ed1e9fc3da5e8ddc"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native

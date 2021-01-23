SUMMARY = "NPM: cspell-lib"
DESCRIPTION = "A library of useful functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-comment-json-native \
           npm-configstore-native \
           npm-cosmiconfig-native \
           npm-cspell-cspell-bundled-dicts-native \
           npm-cspell-io-native \
           npm-cspell-trie-lib-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-minimatch-native \
           npm-resolve-from-native \
           npm-resolve-global-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.2.1.tgz"
SRC_URI[md5sum] = "37bcab13eaf445550025d8f59c5dc142"
SRC_URI[sha256sum] = "d5292ba19f1ae9fe2371faecfcba0b1d0cad217d6dded590a6767c6d3c7c644b"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native

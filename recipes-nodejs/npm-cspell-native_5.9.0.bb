SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://streetsidesoftware.github.io/cspell/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fs-extra-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-strip-ansi-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.9.0.tgz"
SRC_URI[md5sum] = "f703fffa5b453c7c3a327d1d6d5d8fb5"
SRC_URI[sha256sum] = "3da2b209e09b85f7551acc0a2905237924c471086fb2a236a386e0e9c46cc1e8"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

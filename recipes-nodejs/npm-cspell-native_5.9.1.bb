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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.9.1.tgz"
SRC_URI[md5sum] = "b4f35d60d0c5503b80bbe5d2666174b2"
SRC_URI[sha256sum] = "39a323b3ef6402cf948ed3b7cc2dc7bd68ab96f128e448a3c7d5703c492ceb68"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

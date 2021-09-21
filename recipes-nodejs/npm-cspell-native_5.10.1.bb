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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.10.1.tgz"
SRC_URI[md5sum] = "968516c2ee6ea0048222032f03e70c8a"
SRC_URI[sha256sum] = "851f05716bbed34dbdcea86920cb969dc69be312c386008ff6b75ee3a9c6e105"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

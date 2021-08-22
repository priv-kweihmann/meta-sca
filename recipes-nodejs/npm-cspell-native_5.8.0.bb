SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-cspell-types-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fs-extra-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-strip-ansi-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.8.0.tgz"
SRC_URI[md5sum] = "fbeadf81bf24ed078942ef35a4dfcd86"
SRC_URI[sha256sum] = "edf7ab3f10294c7ae08e2d3ef962d28d87495503ddc923147fa596d6e498987c"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

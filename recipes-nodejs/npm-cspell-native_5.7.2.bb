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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.7.2.tgz"
SRC_URI[md5sum] = "61037532cdcb955e78b5bfa9f7949b5e"
SRC_URI[sha256sum] = "e63ac1d9bae6a7ce91f218a83e2ce2bcecd755f744ebf0ea0a1e9f54c39da678"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

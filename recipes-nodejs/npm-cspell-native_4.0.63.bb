SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-4.0.63.tgz"
SRC_URI[md5sum] = "c1257a36b4b9100296270c78b0dca084"
SRC_URI[sha256sum] = "a5536884ac82e648aaefaa019d351d29959a18007910c815c49396d20e381c4a"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

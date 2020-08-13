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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-4.1.0.tgz"
SRC_URI[md5sum] = "31b854a7e368899ee1741341e270ea10"
SRC_URI[sha256sum] = "bb5484eb61fa62f1ce9ac4f83dd694b07525ed72a5141c1ebdcef6e13c606ec7"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

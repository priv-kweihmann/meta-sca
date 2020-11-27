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
           npm-get-stdin-native \
           npm-glob-native \
           npm-minimatch-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.0.2.tgz"
SRC_URI[md5sum] = "7936fc5fc60187b81012fd071c9d64fb"
SRC_URI[sha256sum] = "8af2d52589a781e8a9687d2c46deca070f4bf1dcc97ec9432f1adbf2fda9080a"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

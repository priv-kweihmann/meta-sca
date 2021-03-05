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
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.3.6.tgz"
SRC_URI[md5sum] = "3ebec61a6238c23803b030831aed19bc"
SRC_URI[sha256sum] = "710e63ea3abb43078b262cf0c37a767e5cbbec2a09ddee37dd8ced9d2e1de31c"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

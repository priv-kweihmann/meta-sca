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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.3.8.tgz"
SRC_URI[md5sum] = "450261107a45da77b9789cde89ab4e66"
SRC_URI[sha256sum] = "f0ae3facdbb54fd635650c17e9b016b3ce20a8faf754928e3a13d7792758581b"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-4.2.0.tgz"
SRC_URI[md5sum] = "c0e269bc894f6c7439276b774820389a"
SRC_URI[sha256sum] = "4c2d6e29a4824455d39e1c6e3bfc2ad9208818cf36c1c8374964c92279fc3d14"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

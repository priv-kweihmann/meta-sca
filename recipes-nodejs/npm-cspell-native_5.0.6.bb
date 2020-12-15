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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.0.6.tgz"
SRC_URI[md5sum] = "bd69c1008aa9ae20ad9395c377e918b2"
SRC_URI[sha256sum] = "d524ab962d9ef7515c035f410819cecd8c8826f772687a0cfb1c6a2a92529129"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

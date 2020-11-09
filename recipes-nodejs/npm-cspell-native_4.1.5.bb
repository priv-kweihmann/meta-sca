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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-4.1.5.tgz"
SRC_URI[md5sum] = "0d1eb780bc049f142994ee7fb3092817"
SRC_URI[sha256sum] = "48100c3a9d5f3b6ceb2214b3f65102c42cc156a95d508af05bcd06f08daea771"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

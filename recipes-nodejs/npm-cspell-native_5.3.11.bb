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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.3.11.tgz"
SRC_URI[md5sum] = "a29eedcf3724c6ade996d086949acae6"
SRC_URI[sha256sum] = "4668cb4183c1aa02a72fc6a9e4db5f957046acce4506cdcff5bd2960dc754e90"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

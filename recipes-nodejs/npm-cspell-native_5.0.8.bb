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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.0.8.tgz"
SRC_URI[md5sum] = "435510fb15ed86f0848378a4f56b6a5e"
SRC_URI[sha256sum] = "640651a493f36ffb26bdd47e2e14716d5dec02c9d8b1acc24658c4a5971f1935"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

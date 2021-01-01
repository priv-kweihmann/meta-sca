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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.1.2.tgz"
SRC_URI[md5sum] = "e4701ddfc1138ed77c61c6830727b7d7"
SRC_URI[sha256sum] = "327deb22e82f5c9fc42f3aaeb95d7b0d6c947dffa7c995cad9ca26e82827816b"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

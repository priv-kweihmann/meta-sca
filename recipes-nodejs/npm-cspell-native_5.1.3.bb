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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.1.3.tgz"
SRC_URI[md5sum] = "6502304a96f2c1c30c6071acf5ea3b7a"
SRC_URI[sha256sum] = "40d865db0c455f66718eabb043503e791ae203a7de7f3e500310d83a616de8f2"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

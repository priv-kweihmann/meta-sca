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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.2.0.tgz"
SRC_URI[md5sum] = "1fb91bec51b2074158eb34fe30406fbd"
SRC_URI[sha256sum] = "179929818d8a980d0e06cb0f48bbd3b20a7164c48546f099c36741239d5fe491"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

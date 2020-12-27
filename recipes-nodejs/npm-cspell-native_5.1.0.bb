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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.1.0.tgz"
SRC_URI[md5sum] = "0258129c1a1ea6bcc755f88472d865ae"
SRC_URI[sha256sum] = "0a7ff60d94407cfd3969b1eee0ef53178aeac825dfe40de4cfbbd65e715ee459"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.3.7.tgz"
SRC_URI[md5sum] = "bd5ff5702d7501bdabc5400f003cb331"
SRC_URI[sha256sum] = "b0a69074553e1b1557c60aed055ec47d90f235edefabdddf76bf75ab02052db7"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

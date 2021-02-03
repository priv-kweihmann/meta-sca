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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.2.4.tgz"
SRC_URI[md5sum] = "a7f19598119eb71c7157a56bafceffff"
SRC_URI[sha256sum] = "27e03a588d8fdfba8a8156eab4c8ba3c0010ec9cbae2628e4842da5ccaeec05d"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

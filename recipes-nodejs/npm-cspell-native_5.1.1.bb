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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.1.1.tgz"
SRC_URI[md5sum] = "fbc451d58811a46e959a661961068d5b"
SRC_URI[sha256sum] = "05ec1122851f5fbc51def70db2b8f2332a0509b4c071bbd02e63cef494e36459"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

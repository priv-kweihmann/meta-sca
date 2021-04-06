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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.3.12.tgz"
SRC_URI[md5sum] = "3cd3f0d6c657c4ff82b42e4b40ed9ae3"
SRC_URI[sha256sum] = "e0b27b6bf0bca1b5624ca7175c43f4d04475cb42969e251be60adafd741b2c5b"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

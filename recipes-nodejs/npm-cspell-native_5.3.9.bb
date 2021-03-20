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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.3.9.tgz"
SRC_URI[md5sum] = "61ac32f9a939e0d162bebcb25139033a"
SRC_URI[sha256sum] = "915724d918b2f871fd73978af53fb1709c8bfd94e53db55f4a5dfeef13f427aa"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

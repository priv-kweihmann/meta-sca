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
           npm-gensequence-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-4.1.4.tgz"
SRC_URI[md5sum] = "4a9bb739dfeba82b4d5fe605a0027e28"
SRC_URI[sha256sum] = "3de60cd9fd76e58e501355671e73ef571ef7e41e4c5b1092b3d5c392031a965b"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native

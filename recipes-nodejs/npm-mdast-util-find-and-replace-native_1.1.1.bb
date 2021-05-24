SUMMARY = "NPM: mdast-util-find-and-replace"
DESCRIPTION = "mdast utility to find and replace text in a tree"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-find-and-replace#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-escape-string-regexp-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-find-and-replace/-/mdast-util-find-and-replace-1.1.1.tgz"
SRC_URI[md5sum] = "f8775841fef9fce7c3fadaaa0ef5507e"
SRC_URI[sha256sum] = "e74cf325ac3f30bed0511eabeda0106ee07bceab0aea58feaff2f12fcd059cf2"

NPM_PKGNAME = "mdast-util-find-and-replace"

inherit npmhelper
inherit native

SUMMARY = "NPM: mdast-util-find-and-replace"
DESCRIPTION = "mdast utility to find and replace text in a tree"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-find-and-replace#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-escape-string-regexp-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-find-and-replace/-/mdast-util-find-and-replace-2.0.0.tgz"
SRC_URI[md5sum] = "e259eae2db928d11ffe8a121dea9cd5c"
SRC_URI[sha256sum] = "0bfa11dc23872c422e19bc18e71998c23019a4e9844ae06595da037e4bdb47d4"

NPM_PKGNAME = "mdast-util-find-and-replace"

inherit npmhelper
inherit native

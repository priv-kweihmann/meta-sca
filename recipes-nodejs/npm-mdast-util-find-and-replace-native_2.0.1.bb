SUMMARY = "NPM: mdast-util-find-and-replace"
DESCRIPTION = "mdast utility to find and replace text in a tree"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-find-and-replace#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-escape-string-regexp-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-find-and-replace/-/mdast-util-find-and-replace-2.0.1.tgz"
SRC_URI[md5sum] = "3b52b1407127e488add7b3b26a039c40"
SRC_URI[sha256sum] = "ebf79e8216431f2baa87e198ca210b2d4a971cc0b60f8483497ecd095f26fa6f"

NPM_PKGNAME = "mdast-util-find-and-replace"

inherit npmhelper
inherit native

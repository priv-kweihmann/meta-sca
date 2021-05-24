SUMMARY = "NPM: mdast-util-gfm-task-list-item"
DESCRIPTION = "mdast extension to parse and serialize GFM task list items"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-task-list-item#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-task-list-item/-/mdast-util-gfm-task-list-item-0.1.6.tgz"
SRC_URI[md5sum] = "291b22b67dd968c1ffae3580cdcc8dbe"
SRC_URI[sha256sum] = "8b7bc792a649fd661ce46bbb19d3fc278c500f958ebfcb58c72965f8c270ce8b"

NPM_PKGNAME = "mdast-util-gfm-task-list-item"

inherit npmhelper
inherit native

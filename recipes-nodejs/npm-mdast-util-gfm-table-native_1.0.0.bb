SUMMARY = "NPM: mdast-util-gfm-table"
DESCRIPTION = "mdast extension to parse and serialize GFM tables"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-markdown-table-native \
           npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-table/-/mdast-util-gfm-table-1.0.0.tgz"
SRC_URI[md5sum] = "11bf7039d6a002cc508940b49c901724"
SRC_URI[sha256sum] = "7fc70aa8fb6138fe1f522e4fc3e6ec4859dc00d83b92f8e3c0574a891ac1b54e"

NPM_PKGNAME = "mdast-util-gfm-table"

inherit npmhelper
inherit native

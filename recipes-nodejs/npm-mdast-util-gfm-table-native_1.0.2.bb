SUMMARY = "NPM: mdast-util-gfm-table"
DESCRIPTION = "mdast extension to parse and serialize GFM tables"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-table#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-markdown-table-native \
           npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-table/-/mdast-util-gfm-table-1.0.2.tgz"
SRC_URI[md5sum] = "e90b24ec02b6c30ea1ce1636e35cc44c"
SRC_URI[sha256sum] = "3552999547db57773592bd4ac44a26503d3bb1a26f5a41c590dbb01178ca92dd"

NPM_PKGNAME = "mdast-util-gfm-table"

inherit npmhelper
inherit native

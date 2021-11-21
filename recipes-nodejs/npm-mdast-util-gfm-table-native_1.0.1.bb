SUMMARY = "NPM: mdast-util-gfm-table"
DESCRIPTION = "mdast extension to parse and serialize GFM tables"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-table#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-markdown-table-native \
           npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-table/-/mdast-util-gfm-table-1.0.1.tgz"
SRC_URI[md5sum] = "fad1dd831aef48ebb008ae2796df7655"
SRC_URI[sha256sum] = "7d15bcf166770712278fd1190cc57e87c3698fbd09cc54dcbd09e941b6983e88"

NPM_PKGNAME = "mdast-util-gfm-table"

inherit npmhelper
inherit native

SUMMARY = "NPM: mdast-util-gfm-table"
DESCRIPTION = "mdast extension to parse and serialize GFM tables"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-markdown-table-native \
           npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-table/-/mdast-util-gfm-table-0.1.6.tgz"
SRC_URI[md5sum] = "54abe242bb7b3627b1d2af648c499bdc"
SRC_URI[sha256sum] = "99fcc68996b961bb740d1fff1c2c17e4c2df9cd7b11415e32111bcb1331b7bf9"

NPM_PKGNAME = "mdast-util-gfm-table"

inherit npmhelper
inherit native

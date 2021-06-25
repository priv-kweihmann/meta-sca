SUMMARY = "NPM: mdast-util-gfm"
DESCRIPTION = "mdast extension to parse and serialize GFM (GitHub Flavored Markdown)"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-gfm-autolink-literal-native \
           npm-mdast-util-gfm-strikethrough-native \
           npm-mdast-util-gfm-table-native \
           npm-mdast-util-gfm-task-list-item-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm/-/mdast-util-gfm-1.0.0.tgz"
SRC_URI[md5sum] = "2686e9fd654d402f84b27774b3526ed1"
SRC_URI[sha256sum] = "9b7ad5f0113c85529ff2eb4d090777da7dc443974ebccb668e8d059d3642ddf3"

NPM_PKGNAME = "mdast-util-gfm"

inherit npmhelper
inherit native

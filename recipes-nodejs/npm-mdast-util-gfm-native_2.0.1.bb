SUMMARY = "NPM: mdast-util-gfm"
DESCRIPTION = "mdast extension to parse and serialize GFM (GitHub Flavored Markdown)"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-from-markdown-native \
           npm-mdast-util-gfm-autolink-literal-native \
           npm-mdast-util-gfm-footnote-native \
           npm-mdast-util-gfm-strikethrough-native \
           npm-mdast-util-gfm-table-native \
           npm-mdast-util-gfm-task-list-item-native \
           npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm/-/mdast-util-gfm-2.0.1.tgz"
SRC_URI[md5sum] = "658bc0490d0d170d04d9fb6b4a78c0af"
SRC_URI[sha256sum] = "b875fcddd00a92dcd9431182bf236e93b2d9bfa4a5a7fd10b72ab08061b3af27"

NPM_PKGNAME = "mdast-util-gfm"

inherit npmhelper
inherit native

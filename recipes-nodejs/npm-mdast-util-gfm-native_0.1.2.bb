SUMMARY = "NPM: mdast-util-gfm"
DESCRIPTION = "mdast extension to parse and serialize GFM (GitHub Flavored Markdown)"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-gfm-autolink-literal-native \
           npm-mdast-util-gfm-strikethrough-native \
           npm-mdast-util-gfm-table-native \
           npm-mdast-util-gfm-task-list-item-native \
           npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm/-/mdast-util-gfm-0.1.2.tgz"
SRC_URI[md5sum] = "a1ce33b3f8dee033c0773d00bf9c39bb"
SRC_URI[sha256sum] = "5f76df22484ad34a10ffaca316a5b153b022a34803f3bad09428a69453d115aa"

NPM_PKGNAME = "mdast-util-gfm"

inherit npmhelper
inherit native

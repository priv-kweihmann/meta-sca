SUMMARY = "NPM: @textlint/markdown-to-ast"
DESCRIPTION = "Parse Markdown to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/markdown-to-ast/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-debug-native \
           npm-remark-footnotes-native \
           npm-remark-frontmatter-native \
           npm-remark-gfm-native \
           npm-remark-parse-native \
           npm-textlint-ast-node-types-native \
           npm-traverse-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-12.1.1.tgz"
SRC_URI[md5sum] = "b75f1cba2ab6e618b3c3bb7c307c84fa"
SRC_URI[sha256sum] = "62e263eea43eeeaced0e9c2266d184e2e4228349cead88b0576bc549170f7442"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

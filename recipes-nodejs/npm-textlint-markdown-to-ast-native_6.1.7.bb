SUMMARY = "NPM: @textlint/markdown-to-ast"
DESCRIPTION = "Parse Markdown to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/markdown-to-ast/"

DEPENDS = "npm-debug-native npm-remark-frontmatter-native npm-remark-parse-native npm-structured-source-native npm-textlint-ast-node-types-native npm-traverse-native npm-unified-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-6.1.7.tgz"
SRC_URI[md5sum] = "d424ca705a33cd7ab404da711602aa2e"
SRC_URI[sha256sum] = "6d50a1d097ee659115a776e92e5c3d01f7596a603eca03626fbd6f2bca2dd157"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

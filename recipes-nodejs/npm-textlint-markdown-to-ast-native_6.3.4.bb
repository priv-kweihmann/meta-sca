SUMMARY = "NPM: @textlint/markdown-to-ast"
DESCRIPTION = "Parse Markdown to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/markdown-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-debug-native \
           npm-remark-frontmatter-native \
           npm-remark-parse-native \
           npm-structured-source-native \
           npm-textlint-ast-node-types-native \
           npm-traverse-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-6.3.4.tgz"
SRC_URI[md5sum] = "6a99d8816c364d09dc77d4787abdd455"
SRC_URI[sha256sum] = "bb718a01480ba76b0b5f6ad462c977e22ff2387a1818bc4f1ab1db46d7657768"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

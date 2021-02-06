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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-6.3.2.tgz"
SRC_URI[md5sum] = "34451cba754fed65535b9dc840e275c9"
SRC_URI[sha256sum] = "ff5ce8bf078847084e7d4e692ab4d850b8f9da10488e5cf1eb3f03342eaaedd0"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

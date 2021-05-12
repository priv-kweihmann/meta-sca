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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-6.3.5.tgz"
SRC_URI[md5sum] = "6a6e3fd1eec1b63ebd4de243b547a857"
SRC_URI[sha256sum] = "db4412dca08d3e5530dae3463cb85415d64ae13894986ba851009d153e7a2f2a"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

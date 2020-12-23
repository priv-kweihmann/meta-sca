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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-6.2.6.tgz"
SRC_URI[md5sum] = "0a03af6d555f3f7c21f0a9825bb82bde"
SRC_URI[sha256sum] = "bdd3715b0ee54acea9b722bff6edd440dda345b154a9df236bf84d2caa5b8a9f"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

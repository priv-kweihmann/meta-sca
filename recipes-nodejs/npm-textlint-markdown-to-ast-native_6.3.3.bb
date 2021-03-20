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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-6.3.3.tgz"
SRC_URI[md5sum] = "4f76f208b40d3856cafe6bbd4d9ed419"
SRC_URI[sha256sum] = "de341638888f7811b59d0cf58f566cbf83a5a369be7e4742aa787f6aaaf619dc"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

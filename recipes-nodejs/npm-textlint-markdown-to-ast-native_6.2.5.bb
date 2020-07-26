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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-6.2.5.tgz"
SRC_URI[md5sum] = "e1b1e988475e8485490718a88b96d5da"
SRC_URI[sha256sum] = "eed7b0b24cc2b4aa10cafc2a72c194d52ba64f4b0ff00707d37909f39b50d22d"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

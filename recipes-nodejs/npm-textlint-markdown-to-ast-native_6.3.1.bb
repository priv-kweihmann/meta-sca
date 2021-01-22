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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-6.3.1.tgz"
SRC_URI[md5sum] = "12110bea5f280eeb605c5d80880a95ac"
SRC_URI[sha256sum] = "5c1c93b8f7535ffbe763e7ee285c49d2c64fdeb9c0562229ae6b95b5e3a8454d"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

SUMMARY = "NPM: @textlint/markdown-to-ast"
DESCRIPTION = "Parse Markdown to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/markdown-to-ast/"

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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-12.0.0.tgz"
SRC_URI[md5sum] = "d45a945ab38981986ae4612d7484c311"
SRC_URI[sha256sum] = "0538c1edb565d1e089c1f2e5be578cabd5d969358fc1d3b85550f37f1d524442"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

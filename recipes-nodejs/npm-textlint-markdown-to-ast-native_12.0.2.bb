SUMMARY = "NPM: @textlint/markdown-to-ast"
DESCRIPTION = "Parse Markdown to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/markdown-to-ast/"

DEFAULT_PREFERENCE = "-1"
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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-12.0.2.tgz"
SRC_URI[md5sum] = "5e6bced2ae128e6699e2b4424ff72d3b"
SRC_URI[sha256sum] = "aa7eb7728c72eac5eff82e6d261b4c0b883f245514a50a1f0da896d8369a31db"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

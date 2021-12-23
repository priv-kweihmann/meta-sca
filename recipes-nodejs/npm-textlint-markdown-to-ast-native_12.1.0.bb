SUMMARY = "NPM: @textlint/markdown-to-ast"
DESCRIPTION = "Parse Markdown to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/markdown-to-ast/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/@textlint/markdown-to-ast/-/markdown-to-ast-12.1.0.tgz"
SRC_URI[md5sum] = "0b4baeba40f63cebab062d1676171741"
SRC_URI[sha256sum] = "c98a86613e17d5d2a0b4b6d07ac9abd33ab33cd979e5b1d5c8cdfd6127181386"

NPM_PKGNAME = "@textlint/markdown-to-ast"

inherit npmhelper
inherit native

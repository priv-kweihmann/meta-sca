SUMMARY = "NPM: mdast-util-mdxjs-esm"
DESCRIPTION = "mdast extension to parse and serialize MDX.js ESM (import/exports)"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-mdxjs-esm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-from-markdown-native \
           npm-mdast-util-to-markdown-native \
           npm-types-estree-jsx-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-mdxjs-esm/-/mdast-util-mdxjs-esm-1.1.1.tgz"
SRC_URI[md5sum] = "422585df3ef487323d3af954df9a0e6f"
SRC_URI[sha256sum] = "c032ea51818c4424ac4a5b91ed7b5a1a64ac66ccd722e205f9eb7eefe9168854"

NPM_PKGNAME = "mdast-util-mdxjs-esm"

inherit npmhelper
inherit native

SUMMARY = "NPM: mdast-util-mdx"
DESCRIPTION = "mdast extension to parse and serialize MDX (or MDX.js)"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-mdx#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-mdx-expression-native \
           npm-mdast-util-mdx-jsx-native \
           npm-mdast-util-mdxjs-esm-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-mdx/-/mdast-util-mdx-1.1.0.tgz"
SRC_URI[md5sum] = "e177facd1e8d5249cac0b68cc668d42c"
SRC_URI[sha256sum] = "ed389629b78e1b9143c281800f6485de5baa33372b3b6a922ff32c5941f12bb1"

NPM_PKGNAME = "mdast-util-mdx"

inherit npmhelper
inherit native

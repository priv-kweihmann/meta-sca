SUMMARY = "NPM: mdast-util-mdx-expression"
DESCRIPTION = "mdast extension to parse and serialize MDX (or MDX.js) expressions"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-mdx-expression#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-types-estree-jsx-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-mdx-expression/-/mdast-util-mdx-expression-1.1.1.tgz"
SRC_URI[md5sum] = "c7137c2b3885f2451fc0e32bb7b80e80"
SRC_URI[sha256sum] = "d41d122a42f7f76e4f8e321c2b0ff1a3b0202695670b5ec21b8dd79810f7d8f6"

NPM_PKGNAME = "mdast-util-mdx-expression"

inherit npmhelper
inherit native

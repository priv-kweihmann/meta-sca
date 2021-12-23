SUMMARY = "NPM: mdast-util-gfm-footnote"
DESCRIPTION = "mdast extension to parse and serialize GFM footnotes"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-footnote#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-micromark-util-normalize-identifier-native \
           npm-types-mdast-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-footnote/-/mdast-util-gfm-footnote-1.0.0.tgz"
SRC_URI[md5sum] = "9968877d3ca9858f3ad96b9216290a7a"
SRC_URI[sha256sum] = "b97ec347ec613d0c2736656de2b1530593075ace752f1aadfa53e86317f9cba5"

NPM_PKGNAME = "mdast-util-gfm-footnote"

inherit npmhelper
inherit native

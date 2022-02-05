SUMMARY = "NPM: mdast-util-gfm-footnote"
DESCRIPTION = "mdast extension to parse and serialize GFM footnotes"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-footnote#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-micromark-util-normalize-identifier-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-footnote/-/mdast-util-gfm-footnote-1.0.1.tgz"
SRC_URI[md5sum] = "68c3f2a820334d0c2ea017321e700f67"
SRC_URI[sha256sum] = "20eeaf5b0a7697eee7d912e88af6c6ef6265ea4c26f043bd46d2ced266cda7c5"

NPM_PKGNAME = "mdast-util-gfm-footnote"

inherit npmhelper
inherit native

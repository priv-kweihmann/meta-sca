SUMMARY = "NPM: mdast-util-from-markdown"
DESCRIPTION = "mdast utility to parse markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-from-markdown#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-decode-named-character-reference-native \
           npm-mdast-util-to-string-native \
           npm-micromark-native \
           npm-micromark-util-decode-numeric-character-reference-native \
           npm-micromark-util-decode-string-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-1.2.0.tgz"
SRC_URI[md5sum] = "fe53bf2061b59965545a0784514ef5e7"
SRC_URI[sha256sum] = "0e25d8b6f37dda461b586e8453bea761d5b60f01fb8a0f2608afe0378f89c6a1"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

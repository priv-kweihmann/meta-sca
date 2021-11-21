SUMMARY = "NPM: mdast-util-from-markdown"
DESCRIPTION = "mdast utility to parse markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-from-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-string-native \
           npm-micromark-native \
           npm-micromark-util-decode-numeric-character-reference-native \
           npm-micromark-util-decode-string-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-parse-entities-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-1.1.1.tgz"
SRC_URI[md5sum] = "9df4550cfc639101ee87fbff3ddd27ba"
SRC_URI[sha256sum] = "5895532abfc3369af6ec00684187ac5f3d0003bde3f131fdd32e720f7f53af23"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

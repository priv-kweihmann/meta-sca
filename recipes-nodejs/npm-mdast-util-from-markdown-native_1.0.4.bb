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

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-1.0.4.tgz"
SRC_URI[md5sum] = "9d4b7d3ab5475aa8c00340310837c26b"
SRC_URI[sha256sum] = "47ed22ab4377244faf54a5b7e6f6815aefc34f7050e440e7b933fe80b416d899"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

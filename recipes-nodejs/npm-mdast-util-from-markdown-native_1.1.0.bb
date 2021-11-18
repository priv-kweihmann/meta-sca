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

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-1.1.0.tgz"
SRC_URI[md5sum] = "2d2f167bbb809a77a360d62eaa3af122"
SRC_URI[sha256sum] = "e98fb7b96c9c2731d901151ce6650b7c1968420314545d125bdfb16d12175147"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

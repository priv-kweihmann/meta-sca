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
           npm-power-assert-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-unist-util-stringify-position-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-1.0.3.tgz"
SRC_URI[md5sum] = "911f6909d1d31493f25cee2fc60b1146"
SRC_URI[sha256sum] = "6de20d1e7698883ba72dd3be38abfa4192a76f9566646f3486cb08bbef5d96f8"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

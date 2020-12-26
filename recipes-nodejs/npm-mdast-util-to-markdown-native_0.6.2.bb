SUMMARY = "NPM: mdast-util-to-markdown"
DESCRIPTION = "mdast utility to serialize markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-longest-streak-native \
           npm-mdast-util-to-string-native \
           npm-parse-entities-native \
           npm-repeat-string-native \
           npm-types-unist-native \
           npm-zwitch-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-0.6.2.tgz"
SRC_URI[md5sum] = "f00377acf1ac3f1a4aefbcfbe1b678e0"
SRC_URI[sha256sum] = "3f8c1a84c778ec38ec9b5c14651227afbb82461ceef7855807d3071a4b4c57d2"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

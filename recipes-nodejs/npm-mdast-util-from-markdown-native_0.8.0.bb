SUMMARY = "NPM: mdast-util-from-markdown"
DESCRIPTION = "mdast utility to parse markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-from-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-string-native \
           npm-micromark-native \
           npm-parse-entities-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-0.8.0.tgz"
SRC_URI[md5sum] = "b9b0f033bf950bbbbea059ef6f543fdc"
SRC_URI[sha256sum] = "3f08be10900f425f39b3d32629ce93a8b42897acc2e30cc61844ebe3c01e5f62"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

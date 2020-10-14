SUMMARY = "NPM: mdast-util-to-markdown"
DESCRIPTION = "mdast utility to serialize markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-longest-streak-native \
           npm-mdast-util-to-string-native \
           npm-parse-entities-native \
           npm-repeat-string-native \
           npm-stringify-entities-native \
           npm-types-unist-native \
           npm-zwitch-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-0.5.1.tgz"
SRC_URI[md5sum] = "9685bf2351d7f2ddce8e8523bb414bf8"
SRC_URI[sha256sum] = "ce9ea7c04a3a241e972a3acf6a5bd104e63b582a57d22a66b4d68550bac42180"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

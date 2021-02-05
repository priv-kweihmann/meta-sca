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

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-0.6.5.tgz"
SRC_URI[md5sum] = "5e3c1b92824476d3b6e5e7095e209934"
SRC_URI[sha256sum] = "7aaaef587b67c72c2df2c613c965e79c6906e30b72b0f1234ea8aed604c509a7"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

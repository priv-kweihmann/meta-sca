SUMMARY = "NPM: mdast-util-to-markdown"
DESCRIPTION = "mdast utility to serialize markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-longest-streak-native \
           npm-mdast-util-to-string-native \
           npm-parse-entities-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-zwitch-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.0.1.tgz"
SRC_URI[md5sum] = "b9543c393698636cd7cba7819d17cfe0"
SRC_URI[sha256sum] = "91fb91d053a6f51d14eed3ccd73ec18e045b15d8700305dcbabdba959d5c8ed9"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

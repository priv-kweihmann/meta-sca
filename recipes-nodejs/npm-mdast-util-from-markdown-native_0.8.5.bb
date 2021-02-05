SUMMARY = "NPM: mdast-util-from-markdown"
DESCRIPTION = "mdast utility to parse markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-from-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-string-native \
           npm-micromark-native \
           npm-parse-entities-native \
           npm-types-mdast-native \
           npm-unist-util-stringify-position-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-0.8.5.tgz"
SRC_URI[md5sum] = "0794fbcb55ce43a4d76664db03ef3f8f"
SRC_URI[sha256sum] = "822c6c4d5db31ac2080aee4580a3103f7aa0502fbe3ecd3f9d568273772591a4"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

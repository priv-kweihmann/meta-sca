SUMMARY = "NPM: mdast-util-from-markdown"
DESCRIPTION = "mdast utility to parse markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-from-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-string-native \
           npm-micromark-native \
           npm-parse-entities-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-0.8.2.tgz"
SRC_URI[md5sum] = "7e2dbd0c4da2c151439869e145554dc0"
SRC_URI[sha256sum] = "db0dc0b75dccd9f9194c75299d1f37b635f5c07a7aa7e73fd3409d5363da4ee5"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

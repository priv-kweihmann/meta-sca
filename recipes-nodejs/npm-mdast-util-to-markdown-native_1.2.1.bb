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
           npm-unist-util-visit-native \
           npm-zwitch-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.2.1.tgz"
SRC_URI[md5sum] = "964c8ae7f5525773f6c0b588c27bdb38"
SRC_URI[sha256sum] = "ba15be2498644ae3271b6cda3527cecbf1639553785a4d2547236a548bd60210"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

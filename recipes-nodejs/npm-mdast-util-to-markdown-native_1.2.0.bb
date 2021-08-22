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

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.2.0.tgz"
SRC_URI[md5sum] = "2410b2f0f613c016e9fbf63f32fae279"
SRC_URI[sha256sum] = "5da084a2f0de911c5de1e0be02f9fbea680f63272d231d156577e30c476102ee"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

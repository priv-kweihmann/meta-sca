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

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.1.0.tgz"
SRC_URI[md5sum] = "535c0bd5060226be5a4354658f78bc76"
SRC_URI[sha256sum] = "1014e4cfe5b80d2dccd9973bac2f07ff163018a9853895d4d1f79851bd0340ba"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

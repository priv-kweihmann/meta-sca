SUMMARY = "NPM: mdast-util-to-markdown"
DESCRIPTION = "mdast utility to serialize markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-longest-streak-native \
           npm-mdast-util-to-string-native \
           npm-micromark-util-decode-string-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-unist-util-visit-native \
           npm-zwitch-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.2.4.tgz"
SRC_URI[md5sum] = "c60810c2b5d7244f6c3384449ce018a9"
SRC_URI[sha256sum] = "c190d91232af242a1b847ecf4cc707cd4bb3b2719178a146f4e66c95b6be2eae"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

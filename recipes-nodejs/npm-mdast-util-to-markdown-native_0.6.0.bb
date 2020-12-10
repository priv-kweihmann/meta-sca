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

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-0.6.0.tgz"
SRC_URI[md5sum] = "c05da5425ef130a28b1dc49a1f8c94ab"
SRC_URI[sha256sum] = "5875a74259fed3374579b45b0a9e1ab3594d7866025208e75df411c65e8af1f0"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

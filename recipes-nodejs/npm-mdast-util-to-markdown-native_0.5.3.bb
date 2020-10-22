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

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-0.5.3.tgz"
SRC_URI[md5sum] = "dd0b45f21fd0ad95a2585af96120b422"
SRC_URI[sha256sum] = "b16d3365fe3b05f8608190fc907755d6f3f0e21179a7acabfa06e8895799dae3"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

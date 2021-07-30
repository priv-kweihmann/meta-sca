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

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.1.1.tgz"
SRC_URI[md5sum] = "a0bb49670421bd198f56b52dd81937cf"
SRC_URI[sha256sum] = "39331048f6bfa79c025a1566053334ea17a257ce74f76c135760cf8544748c46"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

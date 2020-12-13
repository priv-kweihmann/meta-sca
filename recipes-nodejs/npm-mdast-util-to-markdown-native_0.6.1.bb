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

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-0.6.1.tgz"
SRC_URI[md5sum] = "b7c4a3d7a2dc09ba23268534e52afe96"
SRC_URI[sha256sum] = "0d0d19471ee9482de13712924ead780de4fa6542e14e96775b5c3afaf2c9e2f5"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native

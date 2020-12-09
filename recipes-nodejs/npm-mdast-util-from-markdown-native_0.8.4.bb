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

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-0.8.4.tgz"
SRC_URI[md5sum] = "0a35ceaf9f2088e373ca5f271b39c568"
SRC_URI[sha256sum] = "60a62033e9e6cdb4cef1cb3f3c513a0e5016a610d925cb0b07949ac13992c0e3"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native

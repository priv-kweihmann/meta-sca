SUMMARY = "NPM: hast-util-to-nlcst"
DESCRIPTION = "hast utility to transform to nlcst"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-to-nlcst#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-embedded-native \
           npm-hast-util-is-element-native \
           npm-hast-util-phrasing-native \
           npm-hast-util-to-string-native \
           npm-hast-util-whitespace-native \
           npm-nlcst-to-string-native \
           npm-unist-util-position-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/hast-util-to-nlcst/-/hast-util-to-nlcst-1.2.8.tgz"
SRC_URI[md5sum] = "c29c34466a2072197fb6ef6f8cb6806b"
SRC_URI[sha256sum] = "f93ed6c3391663fa90e4f0d42b469a7dff2a9dcd1f31407540ca470b422a35f9"

NPM_PKGNAME = "hast-util-to-nlcst"

inherit npmhelper
inherit native

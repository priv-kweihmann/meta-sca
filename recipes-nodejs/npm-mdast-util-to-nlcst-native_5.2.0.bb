SUMMARY = "NPM: mdast-util-to-nlcst"
DESCRIPTION = "mdast utility to transform to nlcst"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-nlcst#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native \
           npm-types-mdast-native \
           npm-types-nlcst-native \
           npm-types-unist-native \
           npm-unist-util-position-native \
           npm-vfile-location-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-nlcst/-/mdast-util-to-nlcst-5.2.0.tgz"
SRC_URI[md5sum] = "2508a0c4f0306455c819ae0bbaae61fb"
SRC_URI[sha256sum] = "47b8afa26d186d81acda3c15793a71a8c36c9e797e7b02845efd98212a2aad31"

NPM_PKGNAME = "mdast-util-to-nlcst"

inherit npmhelper
inherit native

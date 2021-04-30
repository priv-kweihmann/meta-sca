SUMMARY = "NPM: mdast-util-to-nlcst"
DESCRIPTION = "mdast utility to transform to nlcst"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-nlcst#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native \
           npm-repeat-string-native \
           npm-types-mdast-native \
           npm-types-repeat-string-native \
           npm-types-unist-native \
           npm-unist-util-position-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-nlcst/-/mdast-util-to-nlcst-5.0.0.tgz"
SRC_URI[md5sum] = "cdfcada270698c141252da36bc24fa79"
SRC_URI[sha256sum] = "aa6808a2d6ecef9710a2b3ceb21c6b7c0e2f2b8399a27428a2a04f185f411d02"

NPM_PKGNAME = "mdast-util-to-nlcst"

inherit npmhelper
inherit native

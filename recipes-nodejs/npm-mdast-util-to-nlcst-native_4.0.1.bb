SUMMARY = "NPM: mdast-util-to-nlcst"
DESCRIPTION = "mdast utility to transform to nlcst"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-nlcst#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native \
           npm-repeat-string-native \
           npm-unist-util-position-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-nlcst/-/mdast-util-to-nlcst-4.0.1.tgz"
SRC_URI[md5sum] = "ddc8d4424f7f18bdd359957f055170e6"
SRC_URI[sha256sum] = "e2073085b2f1a91ade6fdb4f339f534862fe8683e55e8c576c35b9ec2089c913"

NPM_PKGNAME = "mdast-util-to-nlcst"

inherit npmhelper
inherit native

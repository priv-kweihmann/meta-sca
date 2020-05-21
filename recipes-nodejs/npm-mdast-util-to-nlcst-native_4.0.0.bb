SUMMARY = "NPM: mdast-util-to-nlcst"
DESCRIPTION = "mdast utility to transform to nlcst"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-nlcst#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native \
           npm-repeat-string-native \
           npm-unist-util-position-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-nlcst/-/mdast-util-to-nlcst-4.0.0.tgz"
SRC_URI[md5sum] = "6db3f73c66b4f4bc95e825a34f396f8d"
SRC_URI[sha256sum] = "622ce0991eb4bb301ae6a258a69f930a6dde42015f169dd826eaa5d225e638df"

NPM_PKGNAME = "mdast-util-to-nlcst"

inherit npmhelper
inherit native

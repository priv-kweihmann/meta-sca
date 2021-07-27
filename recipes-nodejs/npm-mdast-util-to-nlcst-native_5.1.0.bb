SUMMARY = "NPM: mdast-util-to-nlcst"
DESCRIPTION = "mdast utility to transform to nlcst"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-nlcst#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-unist-util-position-native \
           npm-vfile-location-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-nlcst/-/mdast-util-to-nlcst-5.1.0.tgz"
SRC_URI[md5sum] = "65464b0379a88702ec855958a07eba87"
SRC_URI[sha256sum] = "886f8085bde10ae9ce2d13001a8641b72c9e1ad470c7d443ef9e97904909d5b7"

NPM_PKGNAME = "mdast-util-to-nlcst"

inherit npmhelper
inherit native

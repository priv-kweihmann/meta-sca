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
           npm-types-hast-native \
           npm-types-unist-native \
           npm-unist-util-position-native \
           npm-vfile-location-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/hast-util-to-nlcst/-/hast-util-to-nlcst-2.1.0.tgz"
SRC_URI[md5sum] = "e1be0a1a5b74d1d830c6e23422040f77"
SRC_URI[sha256sum] = "6b5d3d334e7fc6ae63c279ae9094a31a80faa1738c1d662873d977ce0aa37ba0"

NPM_PKGNAME = "hast-util-to-nlcst"

inherit npmhelper
inherit native

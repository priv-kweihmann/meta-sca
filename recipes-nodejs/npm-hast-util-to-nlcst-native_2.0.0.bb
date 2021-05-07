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

SRC_URI = "https://registry.npmjs.org/hast-util-to-nlcst/-/hast-util-to-nlcst-2.0.0.tgz"
SRC_URI[md5sum] = "a31165a9361c96b20cecfa0e67f6db97"
SRC_URI[sha256sum] = "bc35687acf7da6fab37e0ee191d3ef901a6517c587ba0a70bb1acf58b4f88d05"

NPM_PKGNAME = "hast-util-to-nlcst"

inherit npmhelper
inherit native

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
           npm-types-nlcst-native \
           npm-types-unist-native \
           npm-unist-util-position-native \
           npm-vfile-location-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/hast-util-to-nlcst/-/hast-util-to-nlcst-2.2.0.tgz"
SRC_URI[md5sum] = "7a04c3a21044f2f2afdbcbb9881e9bc3"
SRC_URI[sha256sum] = "1a03c2a73e67716dfa4816d27f66b872a28433bd7a1129b4777820e605088106"

NPM_PKGNAME = "hast-util-to-nlcst"

inherit npmhelper
inherit native

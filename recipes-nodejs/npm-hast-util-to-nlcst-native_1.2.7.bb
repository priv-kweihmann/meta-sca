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

SRC_URI = "https://registry.npmjs.org/hast-util-to-nlcst/-/hast-util-to-nlcst-1.2.7.tgz"
SRC_URI[md5sum] = "dbd2142ab2b49c50ef2f677d87dcc09e"
SRC_URI[sha256sum] = "c6875482792630ab07fac26ba5ad98a787e5d1c8fe3557fe716d0afbff3c25e9"

NPM_PKGNAME = "hast-util-to-nlcst"

inherit npmhelper
inherit native

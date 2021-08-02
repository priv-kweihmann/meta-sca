SUMMARY = "NPM: rehype-retext"
DESCRIPTION = "rehype plugin to transform to retext"
HOMEPAGE = "https://github.com/rehypejs/rehype-retext#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-to-nlcst-native \
           npm-types-hast-native \
           npm-types-unist-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype-retext/-/rehype-retext-3.0.0.tgz"
SRC_URI[md5sum] = "71df2e726aea10efe0da6cba863a1df5"
SRC_URI[sha256sum] = "51e693441b048a0e1b3c2ec4d3389459c0d4aece2a03fe16f5be3c3b8b783553"

NPM_PKGNAME = "rehype-retext"

inherit npmhelper
inherit native

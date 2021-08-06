SUMMARY = "NPM: remark-retext"
DESCRIPTION = "remark plugin to transform to retext"
HOMEPAGE = "https://github.com/remarkjs/remark-retext#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-mdast-util-to-nlcst-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-retext/-/remark-retext-5.0.0.tgz"
SRC_URI[md5sum] = "33fd93c4ae7145cbd2211a75a77784da"
SRC_URI[sha256sum] = "50922f79c6e330ae3573772b7f9ee08f7f8209f67dfdd7eef656bef0a2bcf2fa"

NPM_PKGNAME = "remark-retext"

inherit npmhelper
inherit native

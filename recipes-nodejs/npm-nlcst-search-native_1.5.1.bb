SUMMARY = "NPM: nlcst-search"
DESCRIPTION = "Search for patterns in an NLCST tree"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-search#readme"

DEPENDS = "npm-nlcst-is-literal-native npm-nlcst-normalize-native npm-unist-util-visit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/nlcst-search/-/nlcst-search-1.5.1.tgz"
SRC_URI[md5sum] = "8099c8bad269ba9ded806ebdbceae74c"
SRC_URI[sha256sum] = "597d8e4082f95cb72218cac6f76632c67dae2b426cc6effc26282f1b679151da"

NPM_PKGNAME = "nlcst-search"

inherit npmhelper
inherit native

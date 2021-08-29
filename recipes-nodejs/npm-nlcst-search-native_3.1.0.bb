SUMMARY = "NPM: nlcst-search"
DESCRIPTION = "nlcst utility to search for patterns in a tree"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-search#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-nlcst-is-literal-native \
           npm-nlcst-normalize-native \
           npm-types-nlcst-native \
           npm-types-unist-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/nlcst-search/-/nlcst-search-3.1.0.tgz"
SRC_URI[md5sum] = "e0666937b7a1607a6cc517f20233c064"
SRC_URI[sha256sum] = "4f6dcaf1754eca279af879f18e5eef455776ba598b2a9633b3293c7a5aee2a0d"

NPM_PKGNAME = "nlcst-search"

inherit npmhelper
inherit native

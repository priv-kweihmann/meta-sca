SUMMARY = "NPM: nlcst-search"
DESCRIPTION = "nlcst utility to search for patterns in a tree"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-search#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-nlcst-is-literal-native \
           npm-nlcst-normalize-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/nlcst-search/-/nlcst-search-2.0.0.tgz"
SRC_URI[md5sum] = "ca087cfe21f2aa64fa75d53b0ad9f7f6"
SRC_URI[sha256sum] = "c7447548b6b3500342afe20b62f7675d2b15e0525373b93d92177d0093d21989"

NPM_PKGNAME = "nlcst-search"

inherit npmhelper
inherit native

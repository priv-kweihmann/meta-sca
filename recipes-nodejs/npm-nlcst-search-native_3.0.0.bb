SUMMARY = "NPM: nlcst-search"
DESCRIPTION = "nlcst utility to search for patterns in a tree"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-search#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-nlcst-is-literal-native \
           npm-nlcst-normalize-native \
           npm-types-unist-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/nlcst-search/-/nlcst-search-3.0.0.tgz"
SRC_URI[md5sum] = "e94d885fbac60dd65059280da0633110"
SRC_URI[sha256sum] = "bd093494656d8f201448a605c651e3c84bde3d4b4458cdd86cb2222dfaf54ddb"

NPM_PKGNAME = "nlcst-search"

inherit npmhelper
inherit native

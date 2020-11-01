SUMMARY = "NPM: nlcst-is-literal"
DESCRIPTION = "nlcst utility to check whether a node is meant literally"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-is-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native"

SRC_URI = "https://registry.npmjs.org/nlcst-is-literal/-/nlcst-is-literal-1.2.2.tgz"
SRC_URI[md5sum] = "53e55470fa0f40f15217f9f718c3ac01"
SRC_URI[sha256sum] = "7d522f0f98dfe97b5b5be2c0c2541470e7f339b8b3cdf74e11a5c379e91f8ce8"

NPM_PKGNAME = "nlcst-is-literal"

inherit npmhelper
inherit native

SUMMARY = "NPM: nlcst-is-literal"
DESCRIPTION = "nlcst utility to check whether a node is meant literally"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-is-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native \
           npm-types-nlcst-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/nlcst-is-literal/-/nlcst-is-literal-2.1.0.tgz"
SRC_URI[md5sum] = "08e82ed61cf650021c61bfec42a3a41d"
SRC_URI[sha256sum] = "e50d2bbe058c883a95b157b1d498273247de42aeddaefc04bf35ad97ab3ed9d7"

NPM_PKGNAME = "nlcst-is-literal"

inherit npmhelper
inherit native

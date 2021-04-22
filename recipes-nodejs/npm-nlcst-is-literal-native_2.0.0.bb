SUMMARY = "NPM: nlcst-is-literal"
DESCRIPTION = "nlcst utility to check whether a node is meant literally"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-is-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-to-string-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/nlcst-is-literal/-/nlcst-is-literal-2.0.0.tgz"
SRC_URI[md5sum] = "26ae6ab7f422402860490911a764551e"
SRC_URI[sha256sum] = "73f376e5abdd9da2f07308376e7d98e7282743e0e8e92ba194dabfb4a335829b"

NPM_PKGNAME = "nlcst-is-literal"

inherit npmhelper
inherit native

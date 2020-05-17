SUMMARY = "NPM: nlcst-is-literal"
DESCRIPTION = "nlcst utility to check whether a node is meant literally"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-is-literal#readme"

DEPENDS = "npm-nlcst-to-string-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/nlcst-is-literal/-/nlcst-is-literal-1.2.1.tgz"
SRC_URI[md5sum] = "e080bbc2693391419e8d2e402a806670"
SRC_URI[sha256sum] = "a82b13ffe3733a191e2b90d0f1c7cfd02bbcc74c94b9ec9249291f8c6480d4d5"

NPM_PKGNAME = "nlcst-is-literal"

inherit npmhelper
inherit native

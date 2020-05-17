SUMMARY = "NPM: mdast-util-compact"
DESCRIPTION = "mdast utility to make a tree compact"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-compact#readme"

DEPENDS = "npm-unist-util-visit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/mdast-util-compact/-/mdast-util-compact-2.0.1.tgz"
SRC_URI[md5sum] = "5d80db8d0fb8cf22559e1fa2304ed515"
SRC_URI[sha256sum] = "d93fade26b8f3383ff9fa4d4d27ad0a8ebac1facf4fdc99bbeabc823f1389886"

NPM_PKGNAME = "mdast-util-compact"

inherit npmhelper
inherit native

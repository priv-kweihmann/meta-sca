SUMMARY = "NPM: mdast-util-compact"
DESCRIPTION = "mdast utility to make a tree compact"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-compact#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-compact/-/mdast-util-compact-3.0.0.tgz"
SRC_URI[md5sum] = "70d7948af43f231810a793aba29b6152"
SRC_URI[sha256sum] = "b7a052419b8ec8ad4852d215e46573810cd6ecf603c2354f9dcf6ee71991ccef"

NPM_PKGNAME = "mdast-util-compact"

inherit npmhelper
inherit native

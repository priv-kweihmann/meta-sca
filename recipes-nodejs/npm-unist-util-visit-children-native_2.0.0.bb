SUMMARY = "NPM: unist-util-visit-children"
DESCRIPTION = "unist utility to visit direct children of a parent"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit-children#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit-children/-/unist-util-visit-children-2.0.0.tgz"
SRC_URI[md5sum] = "abe8a4b6088315abd19352a6e9a92f72"
SRC_URI[sha256sum] = "7b801973d078b0dc8e173203f12beea91763029795c389d54b4800094c442f72"

NPM_PKGNAME = "unist-util-visit-children"

inherit npmhelper
inherit native

SUMMARY = "NPM: unist-util-visit-parents"
DESCRIPTION = "unist utility to recursively walk over nodes, with ancestral information"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit-parents#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit-parents/-/unist-util-visit-parents-4.1.1.tgz"
SRC_URI[md5sum] = "76cd5fb8c45dd245f5cc9f1301cf8f13"
SRC_URI[sha256sum] = "68c2de50b2a1b98e1ca8c89541455ad8c6508be479e847ab90d3c7acd08aec0c"

NPM_PKGNAME = "unist-util-visit-parents"

inherit npmhelper
inherit native

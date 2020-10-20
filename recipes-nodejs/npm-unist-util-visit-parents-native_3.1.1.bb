SUMMARY = "NPM: unist-util-visit-parents"
DESCRIPTION = "unist utility to recursively walk over nodes, with ancestral information"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit-parents#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit-parents/-/unist-util-visit-parents-3.1.1.tgz"
SRC_URI[md5sum] = "d695d898c3fea195dd838430d16fe416"
SRC_URI[sha256sum] = "762be1cf08dabc76b47d821413ba13065d8130f14f24c641adac6610e7734bd2"

NPM_PKGNAME = "unist-util-visit-parents"

inherit npmhelper
inherit native

SUMMARY = "NPM: unist-util-visit"
DESCRIPTION = "unist utility to visit nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit/-/unist-util-visit-4.0.0.tgz"
SRC_URI[md5sum] = "b2937eb152cd1d05893c76910bb2b8e1"
SRC_URI[sha256sum] = "0f8ce7aaac023226869db31f6ab876903050c8c91568d0f9f63b52a62af70603"

NPM_PKGNAME = "unist-util-visit"

inherit npmhelper
inherit native

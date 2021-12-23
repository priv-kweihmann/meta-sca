SUMMARY = "NPM: unist-util-visit"
DESCRIPTION = "unist utility to visit nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit/-/unist-util-visit-4.1.0.tgz"
SRC_URI[md5sum] = "42b0fd00d99daea4501bfafea3e5bc6b"
SRC_URI[sha256sum] = "878d323f02a6f006fb6b6ea912ff1853cd5db98322d90259f4b48b87df552e6f"

NPM_PKGNAME = "unist-util-visit"

inherit npmhelper
inherit native

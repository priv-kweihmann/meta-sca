SUMMARY = "NPM: unist-util-visit"
DESCRIPTION = "unist utility to visit nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit/-/unist-util-visit-2.0.3.tgz"
SRC_URI[md5sum] = "9cc10ec11a08d910858e2bc57b79bde2"
SRC_URI[sha256sum] = "e867eb929f30abff19830d95aa0ad454b4f8ba9e1824198705e36ffd2d9d4a49"

NPM_PKGNAME = "unist-util-visit"

inherit npmhelper
inherit native

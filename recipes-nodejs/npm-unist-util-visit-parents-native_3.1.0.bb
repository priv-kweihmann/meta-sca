SUMMARY = "NPM: unist-util-visit-parents"
DESCRIPTION = "unist utility to recursively walk over nodes, with ancestral information"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit-parents#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit-parents/-/unist-util-visit-parents-3.1.0.tgz"
SRC_URI[md5sum] = "947bd5c71d9c8de52f538fa6dae9c870"
SRC_URI[sha256sum] = "0a139464b75e84110b7de522929fbd2e543d4e5f0a1bf290f44c0d996c87dce7"

NPM_PKGNAME = "unist-util-visit-parents"

inherit npmhelper
inherit native

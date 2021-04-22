SUMMARY = "NPM: unist-util-visit-parents"
DESCRIPTION = "unist utility to recursively walk over nodes, with ancestral information"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit-parents#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/unist-util-visit-parents/-/unist-util-visit-parents-4.0.0.tgz"
SRC_URI[md5sum] = "fbd5b2f45d6b6acb6b489a3a66995bd0"
SRC_URI[sha256sum] = "dd47f832d74c80c88697dbf9b4c9430f66e2f4c75047b5dac3fa203b4ad6f062"

NPM_PKGNAME = "unist-util-visit-parents"

inherit npmhelper
inherit native

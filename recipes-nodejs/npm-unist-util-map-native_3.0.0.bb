SUMMARY = "NPM: unist-util-map"
DESCRIPTION = "unist utility to create a new tree by mapping all nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-map#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-map/-/unist-util-map-3.0.0.tgz"
SRC_URI[md5sum] = "34db2d044b7e9fa027af97522b45623c"
SRC_URI[sha256sum] = "d7039a0a747d0948d8524ac1efe27e87cbb56308b3a9d0c4f9ada5dc2ac90368"

NPM_PKGNAME = "unist-util-map"

inherit npmhelper
inherit native

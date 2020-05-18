SUMMARY = "NPM: unist-util-map"
DESCRIPTION = "unist utility to create a new tree by mapping all nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-map#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-object-assign-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/unist-util-map/-/unist-util-map-2.0.1.tgz"
SRC_URI[md5sum] = "b79b65a485b30f1a791175d88b09b0e9"
SRC_URI[sha256sum] = "9834788c6feafac3427c911e87fc617ce315eddfbf16d513a270552705a21b92"

NPM_PKGNAME = "unist-util-map"

inherit npmhelper
inherit native

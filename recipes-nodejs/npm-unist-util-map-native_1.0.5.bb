SUMMARY = "NPM: unist-util-map"
DESCRIPTION = "Create a new Unist tree with all nodes that mapped by the provided function"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-map#readme"

DEPENDS = "npm-object-assign-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/unist-util-map/-/unist-util-map-1.0.5.tgz"
SRC_URI[md5sum] = "948bb36315137421b8c8158422e48d92"
SRC_URI[sha256sum] = "4af0d3233f4524dd80abaaab1b8d7bd71d3bfdf9b9cac8f916897aa45436f6d6"

NPM_PKGNAME = "unist-util-map"

inherit npmhelper
inherit native

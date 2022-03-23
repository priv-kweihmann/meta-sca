SUMMARY = "NPM: unist-util-map"
DESCRIPTION = "unist utility to create a new tree by mapping all nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-map#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-map/-/unist-util-map-3.0.1.tgz"
SRC_URI[md5sum] = "ece051062c41f62decc5a03094d0b475"
SRC_URI[sha256sum] = "f29d192c215de065da9e7d412f53ad0079b641b53af5e849acf4876f5a3e8e00"

NPM_PKGNAME = "unist-util-map"

inherit npmhelper
inherit native

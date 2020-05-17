SUMMARY = "NPM: unist-util-stringify-position"
DESCRIPTION = "unist utility to serialize a node, position, or point as a human readable location"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-stringify-position#readme"

DEPENDS = "npm-types-unist-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/unist-util-stringify-position/-/unist-util-stringify-position-2.0.3.tgz"
SRC_URI[md5sum] = "ccdc427043d22b7aaa8dd72bba9169a2"
SRC_URI[sha256sum] = "a3e64a6462a09ab8fb53d578e4df1d2b660f2f8ec34f0807fb5c1f899e632dfb"

NPM_PKGNAME = "unist-util-stringify-position"

inherit npmhelper
inherit native

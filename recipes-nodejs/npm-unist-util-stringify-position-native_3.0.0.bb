SUMMARY = "NPM: unist-util-stringify-position"
DESCRIPTION = "unist utility to serialize a node, position, or point as a human readable location"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-stringify-position#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-stringify-position/-/unist-util-stringify-position-3.0.0.tgz"
SRC_URI[md5sum] = "14c086065f2472bd109dc3d7c7659cd9"
SRC_URI[sha256sum] = "8084abb06e7abd2ecd87795b2baf9c5a7b66440f304b36c954241e2d14fc6662"

NPM_PKGNAME = "unist-util-stringify-position"

inherit npmhelper
inherit native

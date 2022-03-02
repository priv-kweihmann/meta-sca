SUMMARY = "NPM: unist-util-stringify-position"
DESCRIPTION = "unist utility to serialize a node, position, or point as a human readable location"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-stringify-position#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-stringify-position/-/unist-util-stringify-position-3.0.1.tgz"
SRC_URI[md5sum] = "d2caa014c2455fe25d9655d1e21cbcfa"
SRC_URI[sha256sum] = "37911aeab95dce77c02fb66a796f3de7d26775e030807129626b4fa8c6076bc0"

NPM_PKGNAME = "unist-util-stringify-position"

inherit npmhelper
inherit native

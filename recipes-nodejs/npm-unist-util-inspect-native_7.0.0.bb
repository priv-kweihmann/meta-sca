SUMMARY = "NPM: unist-util-inspect"
DESCRIPTION = "unist utility to inspect nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-inspect#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6bbaa59ebe7f7015186221d4c07c0e65"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/unist-util-inspect/-/unist-util-inspect-7.0.0.tgz"
SRC_URI[md5sum] = "496232ceb00f6642310b11dedfa08492"
SRC_URI[sha256sum] = "034ed560c244d2374b917d83ddddd157c59f3a27addb6e7fe80aedfcd13922b0"

NPM_PKGNAME = "unist-util-inspect"

inherit npmhelper
inherit native

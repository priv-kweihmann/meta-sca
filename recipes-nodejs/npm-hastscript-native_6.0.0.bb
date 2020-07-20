SUMMARY = "NPM: hastscript"
DESCRIPTION = "hast utility to create trees"
HOMEPAGE = "https://github.com/syntax-tree/hastscript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-comma-separated-tokens-native \
           npm-hast-util-parse-selector-native \
           npm-property-information-native \
           npm-space-separated-tokens-native \
           npm-types-hast-native"

SRC_URI = "https://registry.npmjs.org/hastscript/-/hastscript-6.0.0.tgz"
SRC_URI[md5sum] = "3dc837e4d550aa18e1f63833019022be"
SRC_URI[sha256sum] = "81f0310d1665c0630b3d73cf97d4ed5970bbad66f6d264ad94c8310f252030b1"

NPM_PKGNAME = "hastscript"

inherit npmhelper
inherit native

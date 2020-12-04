SUMMARY = "NPM: hast-util-embedded"
DESCRIPTION = "hast utility to check if a node is an embedded element"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-embedded#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-is-element-native"

SRC_URI = "https://registry.npmjs.org/hast-util-embedded/-/hast-util-embedded-1.0.6.tgz"
SRC_URI[md5sum] = "f5c0993dbaa2fddb8ebaa3dd8b1b3ad5"
SRC_URI[sha256sum] = "3ca7e98aac8615b2fa6e9e1724d8faaee55d694f38dd664ddcec447da4061d7c"

NPM_PKGNAME = "hast-util-embedded"

inherit npmhelper
inherit native

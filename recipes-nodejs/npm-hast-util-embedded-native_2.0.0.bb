SUMMARY = "NPM: hast-util-embedded"
DESCRIPTION = "hast utility to check if a node is an embedded element"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-embedded#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-is-element-native"

SRC_URI = "https://registry.npmjs.org/hast-util-embedded/-/hast-util-embedded-2.0.0.tgz"
SRC_URI[md5sum] = "282b1c27fd692633cb79182dcaa24998"
SRC_URI[sha256sum] = "c52b05483bbad5bdc92dfb2caa6e1d90fea9ec843dd1cfc9aab0eb2ed2bdca06"

NPM_PKGNAME = "hast-util-embedded"

inherit npmhelper
inherit native

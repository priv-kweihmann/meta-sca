SUMMARY = "NPM: hast-util-embedded"
DESCRIPTION = "hast utility to check if a node is an embedded element"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-embedded#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-is-element-native"

SRC_URI = "https://registry.npmjs.org/hast-util-embedded/-/hast-util-embedded-1.0.5.tgz"
SRC_URI[md5sum] = "59f5e9db458c5d10fc65d9b3595dca05"
SRC_URI[sha256sum] = "e9131d0d565e5effd9d9c064a56eb7c74d59fdeb487ea2f55532dc1579a313b8"

NPM_PKGNAME = "hast-util-embedded"

inherit npmhelper
inherit native

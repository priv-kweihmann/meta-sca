SUMMARY = "NPM: hast-util-is-element"
DESCRIPTION = "hast utility to check if a node is a (certain) element"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-is-element#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-hast-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/hast-util-is-element/-/hast-util-is-element-2.1.1.tgz"
SRC_URI[md5sum] = "e69bef48069dfe4e7d38730fa9c53616"
SRC_URI[sha256sum] = "bd854c34c43a45ed6b12b2d03fc7bb624838b3e4e0831770971eaa0939fb4434"

NPM_PKGNAME = "hast-util-is-element"

inherit npmhelper
inherit native

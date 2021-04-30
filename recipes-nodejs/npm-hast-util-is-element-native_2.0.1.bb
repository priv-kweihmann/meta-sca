SUMMARY = "NPM: hast-util-is-element"
DESCRIPTION = "hast utility to check if a node is a (certain) element"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-is-element#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-hast-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/hast-util-is-element/-/hast-util-is-element-2.0.1.tgz"
SRC_URI[md5sum] = "fab65ecd3af0ba083b449a7bb67ae1be"
SRC_URI[sha256sum] = "ff9b6bccb219e25f5a8e9c0f58ad1121372bea99a444575ce2006ad9acab50f3"

NPM_PKGNAME = "hast-util-is-element"

inherit npmhelper
inherit native

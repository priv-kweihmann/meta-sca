SUMMARY = "NPM: unist-util-visit-parents"
DESCRIPTION = "unist utility to recursively walk over nodes, with ancestral information"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit-parents#readme"

DEPENDS = "npm-types-unist-native npm-unist-util-is-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/unist-util-visit-parents/-/unist-util-visit-parents-3.0.2.tgz"
SRC_URI[md5sum] = "29814d5982f36ef9e05c0094e622a7cf"
SRC_URI[sha256sum] = "1a054e1075c30b78d77a3a121ae44d49061dc5bb798974826b5106e45532584e"

NPM_PKGNAME = "unist-util-visit-parents"

inherit npmhelper
inherit native

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

SRC_URI = "https://registry.npmjs.org/hastscript/-/hastscript-7.0.1.tgz"
SRC_URI[md5sum] = "06e2908ada28d6d89bade8159eaef121"
SRC_URI[sha256sum] = "6cd27a9b540057424043c3860dd8e4d114aa31f4ca1fc3d205b704c73faa82cf"

NPM_PKGNAME = "hastscript"

inherit npmhelper
inherit native

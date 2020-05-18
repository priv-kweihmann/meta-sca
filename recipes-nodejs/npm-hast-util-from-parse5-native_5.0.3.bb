SUMMARY = "NPM: hast-util-from-parse5"
DESCRIPTION = "hast utility to transform from Parse5’s AST"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-from-parse5#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-ccount-native \
           npm-hastscript-native \
           npm-property-information-native \
           npm-web-namespaces-native \
           npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/hast-util-from-parse5/-/hast-util-from-parse5-5.0.3.tgz"
SRC_URI[md5sum] = "dd957d5ec5d87a54521485a07d5faf29"
SRC_URI[sha256sum] = "ba51321de32d8a23f4a91e73ab1430ec526f0f0a2b2ea14ce5a2df6794b90a09"

NPM_PKGNAME = "hast-util-from-parse5"

inherit npmhelper
inherit native

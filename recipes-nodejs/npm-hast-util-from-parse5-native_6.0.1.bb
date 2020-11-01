SUMMARY = "NPM: hast-util-from-parse5"
DESCRIPTION = "hast utility to transform from Parse5’s AST"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-from-parse5#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hastscript-native \
           npm-property-information-native \
           npm-types-parse5-native \
           npm-vfile-location-native \
           npm-vfile-native \
           npm-web-namespaces-native"

SRC_URI = "https://registry.npmjs.org/hast-util-from-parse5/-/hast-util-from-parse5-6.0.1.tgz"
SRC_URI[md5sum] = "930bc0c65452277a642d57e21cf01d3f"
SRC_URI[sha256sum] = "2777bd0ba7a7403d9b4a4def96523136425a69c78ba29febce185df64d9e0475"

NPM_PKGNAME = "hast-util-from-parse5"

inherit npmhelper
inherit native

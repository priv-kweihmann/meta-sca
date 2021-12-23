SUMMARY = "NPM: hast-util-from-parse5"
DESCRIPTION = "hast utility to transform from Parse5’s AST"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-from-parse5#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hastscript-native \
           npm-property-information-native \
           npm-types-hast-native \
           npm-types-parse5-native \
           npm-types-unist-native \
           npm-vfile-location-native \
           npm-vfile-native \
           npm-web-namespaces-native"

SRC_URI = "https://registry.npmjs.org/hast-util-from-parse5/-/hast-util-from-parse5-7.1.0.tgz"
SRC_URI[md5sum] = "f949a2127ef2f7c9dda16d68a7a5fb5e"
SRC_URI[sha256sum] = "2ee961e736ca60aaa171bc625b9725211c7e3076f7a02f3bb4c91f8a683c053f"

NPM_PKGNAME = "hast-util-from-parse5"

inherit npmhelper
inherit native

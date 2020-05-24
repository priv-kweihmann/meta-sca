SUMMARY = "NPM: hast-util-from-parse5"
DESCRIPTION = "hast utility to transform from Parse5’s AST"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-from-parse5#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-ccount-native \
           npm-hastscript-native \
           npm-property-information-native \
           npm-types-parse5-native \
           npm-vfile-native \
           npm-web-namespaces-native"

SRC_URI = "https://registry.npmjs.org/hast-util-from-parse5/-/hast-util-from-parse5-6.0.0.tgz"
SRC_URI[md5sum] = "3d6f40c90305976338b9cae996ef6b07"
SRC_URI[sha256sum] = "b257729e3461b0f376791fdb8eca4e7c3e38e0263597cfb90527163121443d79"

NPM_PKGNAME = "hast-util-from-parse5"

inherit npmhelper
inherit native

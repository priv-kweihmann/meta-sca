SUMMARY = "NPM: hast-util-from-parse5"
DESCRIPTION = "hast utility to transform from Parse5’s AST"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-from-parse5#readme"

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

SRC_URI = "https://registry.npmjs.org/hast-util-from-parse5/-/hast-util-from-parse5-7.0.0.tgz"
SRC_URI[md5sum] = "ccdd821540ec24efed0d9a247cfff528"
SRC_URI[sha256sum] = "4e93e4faa717b0b3cc405c83f37bd3fb1d1471607172b0d54b729f84cea56c3d"

NPM_PKGNAME = "hast-util-from-parse5"

inherit npmhelper
inherit native

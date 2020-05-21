SUMMARY = "NPM: which-collection"
DESCRIPTION = "Which kind of Collection (Map, Set, WeakMap, WeakSet) is this JavaScript value? Works cross-realm, without `instanceof`, and despite Symbol.toStringTag."
HOMEPAGE = "https://github.com/inspect-js/which-collection#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4"

DEPENDS = "npm-is-map-native \
           npm-is-set-native \
           npm-is-weakmap-native \
           npm-is-weakset-native"

SRC_URI = "https://registry.npmjs.org/which-collection/-/which-collection-1.0.1.tgz"
SRC_URI[md5sum] = "157c1ae950b5e912264fcdb01c10f8fa"
SRC_URI[sha256sum] = "9b2f88f0175e01d59bc62aaa504fa56b424728d6115200d896ce0dc85acd1af0"

NPM_PKGNAME = "which-collection"

inherit npmhelper
inherit native

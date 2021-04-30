SUMMARY = "NPM: hast-util-phrasing"
DESCRIPTION = "hast utility to check if a node is phrasing content"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-phrasing#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-embedded-native \
           npm-hast-util-has-property-native \
           npm-hast-util-is-body-ok-link-native \
           npm-hast-util-is-element-native"

SRC_URI = "https://registry.npmjs.org/hast-util-phrasing/-/hast-util-phrasing-2.0.0.tgz"
SRC_URI[md5sum] = "578c03954458f36d0cee875b4a12c6c2"
SRC_URI[sha256sum] = "9d56792cd99b26492faaf1283aa57f1a1424984bb3e322951f86d4155c22fa7e"

NPM_PKGNAME = "hast-util-phrasing"

inherit npmhelper
inherit native

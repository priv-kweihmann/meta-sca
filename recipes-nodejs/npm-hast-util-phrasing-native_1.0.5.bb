SUMMARY = "NPM: hast-util-phrasing"
DESCRIPTION = "hast utility to check if a node is phrasing content"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-phrasing#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-hast-util-embedded-native \
           npm-hast-util-has-property-native \
           npm-hast-util-is-body-ok-link-native \
           npm-hast-util-is-element-native"

SRC_URI = "https://registry.npmjs.org/hast-util-phrasing/-/hast-util-phrasing-1.0.5.tgz"
SRC_URI[md5sum] = "92d7a4f5c5808ffdd9cc8c6cfb0d79aa"
SRC_URI[sha256sum] = "375dcffcc381ed83628cd96c2c6a6992d224c1b69f4bfc7435f22c808402957d"

NPM_PKGNAME = "hast-util-phrasing"

inherit npmhelper
inherit native

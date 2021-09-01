SUMMARY = "NPM: hast-util-to-html"
DESCRIPTION = "hast utility to serialize to HTML"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-to-html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-ccount-native \
           npm-comma-separated-tokens-native \
           npm-hast-util-is-element-native \
           npm-hast-util-whitespace-native \
           npm-html-void-elements-native \
           npm-property-information-native \
           npm-space-separated-tokens-native \
           npm-stringify-entities-native \
           npm-types-hast-native \
           npm-unist-util-is-native"

SRC_URI = "https://registry.npmjs.org/hast-util-to-html/-/hast-util-to-html-8.0.2.tgz"
SRC_URI[md5sum] = "9da2768c690cf758f044aae7e6a9d001"
SRC_URI[sha256sum] = "90e9dca71ed217a3e5ae205eac2d0db872a812be82e677a3b47f018f8e13df71"

NPM_PKGNAME = "hast-util-to-html"

inherit npmhelper
inherit native

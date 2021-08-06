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

SRC_URI = "https://registry.npmjs.org/hast-util-to-html/-/hast-util-to-html-8.0.1.tgz"
SRC_URI[md5sum] = "434b6ba1974c03bb42d2d4b1c7301467"
SRC_URI[sha256sum] = "167bc458e00c605c83c10cf090d6a039d65ede120be624ab8b77c957e9a3b8b7"

NPM_PKGNAME = "hast-util-to-html"

inherit npmhelper
inherit native

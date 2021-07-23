SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.6.tgz"
SRC_URI[md5sum] = "7af226b6be415c5b3fb229f6e66ac828"
SRC_URI[sha256sum] = "fa0f05740816ee1eb7416c7fbc48d36bdf26be6e315f2f0a6e9ded12c7f53c38"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

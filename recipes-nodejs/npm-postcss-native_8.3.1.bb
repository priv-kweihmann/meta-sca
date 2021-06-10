SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.1.tgz"
SRC_URI[md5sum] = "4827d5dbbee2afb9faf3e0a39edfc3de"
SRC_URI[sha256sum] = "76c813c604b2bcf4105bd07bfe5224d5d63e24cc4b434c692e497a495fc5015c"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

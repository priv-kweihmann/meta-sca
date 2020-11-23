SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.9.tgz"
SRC_URI[md5sum] = "19d73e5e5dbe54008bdfa221966673ae"
SRC_URI[sha256sum] = "555881c12a4afa42b89f273861018a5578a7163a8b2a33282b793a287734d7e3"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

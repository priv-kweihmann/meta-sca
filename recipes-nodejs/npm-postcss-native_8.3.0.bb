SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.0.tgz"
SRC_URI[md5sum] = "9944403d9dc5fb9f799be99265b78d1c"
SRC_URI[sha256sum] = "f9ed88d9e3ca89d7fb5f01d5b6a7a09acff691664ae7b53055985473a69987ce"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

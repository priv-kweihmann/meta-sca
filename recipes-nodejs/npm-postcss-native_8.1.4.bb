SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.4.tgz"
SRC_URI[md5sum] = "025afaf9ee92a68f3ceabcef2f44aee9"
SRC_URI[sha256sum] = "a2ea25167b1e2acce645e3d11225f08af126fc0cfece527323ade87b0dcda856"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

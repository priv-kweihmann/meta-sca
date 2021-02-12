SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.6.tgz"
SRC_URI[md5sum] = "5b0d6db2d6b924cb3b226f8d0487bb66"
SRC_URI[sha256sum] = "7dabc976b148fcdfdf932dfdbd31c8cd6720c945782bbfb8df8cd4f487067f59"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

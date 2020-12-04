SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.14.tgz"
SRC_URI[md5sum] = "56116e119b20ee64807f198d16af84f1"
SRC_URI[sha256sum] = "671e1f34b994145a7d8483b9ecc3fb38ef19c7b81a77454c281b3bb8def7ce2c"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

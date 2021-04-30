SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.13.tgz"
SRC_URI[md5sum] = "d4f9d9336dfed5982e478ca16e0d9c98"
SRC_URI[sha256sum] = "836382b92641e00941c9170546353aafadfd31e459294c49a7d2b360b3d3891d"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

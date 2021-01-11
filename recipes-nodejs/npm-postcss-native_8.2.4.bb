SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.4.tgz"
SRC_URI[md5sum] = "c77159d2b46f045242c4d67b2e44fab4"
SRC_URI[sha256sum] = "7a30e553de8a0004ff3243626a76c68019d39c06be4f658bf338e03217343a75"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

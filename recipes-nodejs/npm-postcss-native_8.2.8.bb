SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.8.tgz"
SRC_URI[md5sum] = "ad72cf304c1c46ab5a8961ac85806ffb"
SRC_URI[sha256sum] = "7cdcee62247d7109a2e2986e27f2c56730e6f40fbbb8571dc3d10e933986013c"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

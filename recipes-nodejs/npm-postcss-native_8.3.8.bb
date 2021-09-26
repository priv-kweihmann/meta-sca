SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanocolors-native \
           npm-nanoid-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.8.tgz"
SRC_URI[md5sum] = "151950566770b90e58b107a5ff5a8c7f"
SRC_URI[sha256sum] = "d4aa0396144e44ec4dbb1ef5c5f3fee148b43af22bfc3a1d5e47a52170f19e50"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

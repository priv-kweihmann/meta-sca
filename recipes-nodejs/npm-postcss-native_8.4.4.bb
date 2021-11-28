SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.4.4.tgz"
SRC_URI[md5sum] = "b4b5013b333b5f5d221c267774679282"
SRC_URI[sha256sum] = "e3b42a33f4064d8f8eff206448c70601bf0387ed9fde4945d06660ebed7cba39"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

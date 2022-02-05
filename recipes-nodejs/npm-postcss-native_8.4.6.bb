SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.4.6.tgz"
SRC_URI[md5sum] = "3e114934b8f6867430caebf8af166427"
SRC_URI[sha256sum] = "3f62f12caa423d306d6268307a197781974ad6022a74cdc61ab309762d8859f1"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

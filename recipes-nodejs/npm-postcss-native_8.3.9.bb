SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.9.tgz"
SRC_URI[md5sum] = "adb6aa324421c1372529515e0b541e18"
SRC_URI[sha256sum] = "840e92b7584c0d313b6368b609f269b19902815da8b22f16a6865b3cc521f4f8"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

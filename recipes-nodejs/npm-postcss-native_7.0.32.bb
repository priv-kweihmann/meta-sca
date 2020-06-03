SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-chalk-native \
           npm-source-map-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-7.0.32.tgz"
SRC_URI[md5sum] = "9a3afde430af8908951cacb3402fbd89"
SRC_URI[sha256sum] = "15c87b2d0b7643a0e58468239713f4e0926db725fdaee26e54545dbe99227925"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

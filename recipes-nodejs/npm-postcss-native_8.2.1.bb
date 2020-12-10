SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.1.tgz"
SRC_URI[md5sum] = "3d011a104feb0660d4314e3fbd77007c"
SRC_URI[sha256sum] = "d9879e76a1d8643f53c44201179bee36289d2d282b9aafbef62d5e29f8ac9c96"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

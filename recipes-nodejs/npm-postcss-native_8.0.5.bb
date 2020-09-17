SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.0.5.tgz"
SRC_URI[md5sum] = "4662d974fa57bbe126a7d1103a608640"
SRC_URI[sha256sum] = "e8296453eed764fea28eb89c3a7d066754bf43781e75ceaa5996a9fbbb5a5e1c"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

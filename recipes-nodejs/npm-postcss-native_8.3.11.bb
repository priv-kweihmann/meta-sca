SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-nanoid-native \
           npm-picocolors-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.11.tgz"
SRC_URI[md5sum] = "5bafe4a024221dc8d030b2a7409a3bed"
SRC_URI[sha256sum] = "354a6d79a146a44b1a28437a98c702d0b5cc06c7b61a17ddc6bcf8a8ee521a18"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

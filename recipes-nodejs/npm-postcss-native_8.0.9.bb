SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.0.9.tgz"
SRC_URI[md5sum] = "86935d63d4a731dbb30b949711a7e775"
SRC_URI[sha256sum] = "8258c95ff121b1dc8c4d001d837aca896418609666af6a3e7a6802c5c3c76d52"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

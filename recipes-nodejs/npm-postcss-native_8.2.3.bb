SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.3.tgz"
SRC_URI[md5sum] = "23667e57851aa62917e796e787094333"
SRC_URI[sha256sum] = "e523db0f3548c498856f61eced075040431005bee9d2eeb0a1cdf63ac164ebcf"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

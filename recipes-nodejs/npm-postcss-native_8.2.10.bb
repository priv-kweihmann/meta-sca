SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.10.tgz"
SRC_URI[md5sum] = "d026c6a840941395023c66b1ff8e9607"
SRC_URI[sha256sum] = "4300e3f48005315881f5157621b6d91eabac9a07aab176c9e79f8ed549ac74b9"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

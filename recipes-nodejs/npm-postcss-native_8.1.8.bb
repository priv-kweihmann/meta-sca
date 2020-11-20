SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-line-column-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.8.tgz"
SRC_URI[md5sum] = "97b303aacbbfb1f0358e556c657cd45e"
SRC_URI[sha256sum] = "fa0cf46494f46c816c31ed983bc182e37efbd7ce76d20a34af7dc40690172b76"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

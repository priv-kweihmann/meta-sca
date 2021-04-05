SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.9.tgz"
SRC_URI[md5sum] = "d69b4303b874b4589a05172ef82ceb20"
SRC_URI[sha256sum] = "02f07aac6144f65e8d17bcd7d66e5a80ede2a47bb0a348c9559c39d83f6777b9"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

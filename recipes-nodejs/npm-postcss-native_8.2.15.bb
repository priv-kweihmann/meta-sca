SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.15.tgz"
SRC_URI[md5sum] = "341325a5b6debb8d3524bb89b9d00f9d"
SRC_URI[sha256sum] = "1d1285b4e8da7fe72e5601bfeacf435be8d23a5288621513b812d84600ee31f7"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

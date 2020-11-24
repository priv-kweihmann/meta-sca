SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.1.10.tgz"
SRC_URI[md5sum] = "b6b8ec2d83db600e7f8e4a4538c121bd"
SRC_URI[sha256sum] = "55fb4939682a813b6cf097d99045762d31ae92ccf1397f434abd3b90aec71b9f"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-js-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.3.5.tgz"
SRC_URI[md5sum] = "04b864067fd313a9cb36919990797ad8"
SRC_URI[sha256sum] = "a548e49f19ecb00dc9b8396da13beaee5ac923ffa70a0237fe8b55c80df315c4"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

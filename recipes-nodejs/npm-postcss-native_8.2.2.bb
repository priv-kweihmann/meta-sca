SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.2.tgz"
SRC_URI[md5sum] = "ff944cf60237ef3d22ca3e90083976c9"
SRC_URI[sha256sum] = "adef82bca059ea20ec822aaa2c88ce0ef545ee2f339958188c1238648977774f"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native

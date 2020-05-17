SUMMARY = "NPM: convert-source-map"
DESCRIPTION = "Converts a source-map from/to  different formats and allows adding/changing properties."
HOMEPAGE = "https://github.com/thlorenz/convert-source-map"

DEPENDS = "npm-safe-buffer-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf595075ff556bc46c43e08f142fa4f5"

SRC_URI = "https://registry.npmjs.org/convert-source-map/-/convert-source-map-1.7.0.tgz"
SRC_URI[md5sum] = "0e5204f1f071e85179a46cb16f500ac1"
SRC_URI[sha256sum] = "2c691638758a2d21562c31b10f2784d8be585158da080877ea7b6da0d82503d9"

NPM_PKGNAME = "convert-source-map"

inherit npmhelper
inherit native

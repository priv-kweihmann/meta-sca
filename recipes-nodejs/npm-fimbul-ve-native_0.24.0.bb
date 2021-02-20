SUMMARY = "NPM: @fimbul/ve"
DESCRIPTION = "Vue processor for wotan"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-fimbul-ymir-native \
           npm-parse5-sax-parser-native \
           npm-tslib-native \
           npm-void-elements-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/ve/-/ve-0.24.0.tgz"
SRC_URI[md5sum] = "34e0fb98c251e5a33383670d4194bace"
SRC_URI[sha256sum] = "1c0f96a156aa0b3edcdf6bb5653b0a887329cbfa218b944c8255ff3320373363"

NPM_PKGNAME = "@fimbul/ve"

inherit npmhelper
inherit native

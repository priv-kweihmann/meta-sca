SUMMARY = "NPM: @fimbul/ymir"
DESCRIPTION = "Core library for the Fimbullinter project"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

DEPENDS = "npm-inversify-native npm-reflect-metadata-native npm-tslib-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://registry.npmjs.org/@fimbul/ymir/-/ymir-0.21.0.tgz"
SRC_URI[md5sum] = "86602be094989d5d7220e26583e4e92e"
SRC_URI[sha256sum] = "608822d3847b0250bee98535b018c64bc901c234240a06e90092ab17a280670c"

NPM_PKGNAME = "@fimbul/ymir"

inherit npmhelper
inherit native

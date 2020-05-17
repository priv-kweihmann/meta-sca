SUMMARY = "NPM: @fimbul/valtyr"
DESCRIPTION = "Wotan plugin to behave almost like TSLint"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

DEPENDS = "npm-fimbul-bifrost-native npm-inversify-native npm-tslib-native npm-tslint-native npm-tsutils-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://registry.npmjs.org/@fimbul/valtyr/-/valtyr-0.21.0.tgz"
SRC_URI[md5sum] = "aca9021245125c3e332a5f3f56011ea1"
SRC_URI[sha256sum] = "6b2f0663eb6c6bc2d04766e1a1560bb33f58e75da32921f25c5e5b0b2a59d414"

NPM_PKGNAME = "@fimbul/valtyr"

inherit npmhelper
inherit native

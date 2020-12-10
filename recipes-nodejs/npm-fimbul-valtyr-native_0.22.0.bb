SUMMARY = "NPM: @fimbul/valtyr"
DESCRIPTION = "Wotan plugin to behave almost like TSLint"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-fimbul-bifrost-native \
           npm-inversify-native \
           npm-tslib-native \
           npm-tslint-native \
           npm-tsutils-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/valtyr/-/valtyr-0.22.0.tgz"
SRC_URI[md5sum] = "878ad624c8e1acf2395e156098fd909e"
SRC_URI[sha256sum] = "ac867b45ed7fb7ffea6eec22f6e033863e8a991d2104dfbfbc19471bd1ddbd8d"

NPM_PKGNAME = "@fimbul/valtyr"

inherit npmhelper
inherit native

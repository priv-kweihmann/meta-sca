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

SRC_URI = "https://registry.npmjs.org/@fimbul/valtyr/-/valtyr-0.24.0.tgz"
SRC_URI[md5sum] = "3e875616767e5a08284d2b183b8b5b62"
SRC_URI[sha256sum] = "8884507bcf616d144fd3bfeeaec391d638df3577dc6546988b8757e9ae8b5a80"

NPM_PKGNAME = "@fimbul/valtyr"

inherit npmhelper
inherit native

SUMMARY = "NPM: @fimbul/mimir"
DESCRIPTION = "Core rules of the Fimbullinter project"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-chalk-native \
           npm-debug-native \
           npm-fimbul-ymir-native \
           npm-tslib-native \
           npm-tsutils-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/mimir/-/mimir-0.24.0.tgz"
SRC_URI[md5sum] = "69b4dd19b85c479cd53eb6515b2317f6"
SRC_URI[sha256sum] = "f1c960b52450b804375ee76ae028d7f0192e1cda91a80bc8ee789b055118d020"

NPM_PKGNAME = "@fimbul/mimir"

inherit npmhelper
inherit native

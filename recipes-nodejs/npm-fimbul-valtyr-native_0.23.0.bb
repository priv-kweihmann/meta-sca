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

SRC_URI = "https://registry.npmjs.org/@fimbul/valtyr/-/valtyr-0.23.0.tgz"
SRC_URI[md5sum] = "56f483ed7c603484221e3aac1c721369"
SRC_URI[sha256sum] = "4309b5b25aeb1b183b7e6ae3db75872870181ff16c829ace6cbcea4f4243f686"

NPM_PKGNAME = "@fimbul/valtyr"

inherit npmhelper
inherit native

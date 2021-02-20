SUMMARY = "NPM: @fimbul/ymir"
DESCRIPTION = "Core library for the Fimbullinter project"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-inversify-native \
           npm-reflect-metadata-native \
           npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/ymir/-/ymir-0.24.0.tgz"
SRC_URI[md5sum] = "061aa99c6349d649c154010978923a31"
SRC_URI[sha256sum] = "1cfac8d87e6fcec0d51e93395052920a88f3e3972d9363647f73e880aab65bc7"

NPM_PKGNAME = "@fimbul/ymir"

inherit npmhelper
inherit native

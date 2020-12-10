SUMMARY = "NPM: @fimbul/ymir"
DESCRIPTION = "Core library for the Fimbullinter project"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-inversify-native \
           npm-reflect-metadata-native \
           npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/ymir/-/ymir-0.22.0.tgz"
SRC_URI[md5sum] = "d91a920cf9e0fa2071e519b090b999b8"
SRC_URI[sha256sum] = "e848f71203d87b9b475cad8e7eeeedbf9e547d5feb3a5fa1af6b55c47d34b7c4"

NPM_PKGNAME = "@fimbul/ymir"

inherit npmhelper
inherit native

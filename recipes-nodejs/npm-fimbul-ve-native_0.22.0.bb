SUMMARY = "NPM: @fimbul/ve"
DESCRIPTION = "Vue processor for wotan"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-fimbul-ymir-native \
           npm-parse5-sax-parser-native \
           npm-tslib-native \
           npm-void-elements-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/ve/-/ve-0.22.0.tgz"
SRC_URI[md5sum] = "8ac81605e1452f1f6c697ada0e4c4d94"
SRC_URI[sha256sum] = "09707cbb006c2ecb506d7a9f5125d04c83a4bd2d25232de0b73c216f7669f6d5"

NPM_PKGNAME = "@fimbul/ve"

inherit npmhelper
inherit native

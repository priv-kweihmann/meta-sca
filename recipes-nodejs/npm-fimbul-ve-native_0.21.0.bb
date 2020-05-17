SUMMARY = "NPM: @fimbul/ve"
DESCRIPTION = "Vue processor for wotan"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

DEPENDS = "npm-fimbul-ymir-native npm-parse5-sax-parser-native npm-tslib-native npm-void-elements-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://registry.npmjs.org/@fimbul/ve/-/ve-0.21.0.tgz"
SRC_URI[md5sum] = "05a139555ad2337e3e51dca59aabf08d"
SRC_URI[sha256sum] = "77fbcc325445e11223be4b1b312f09d9535d36701ef1ac084b75d48922b62057"

NPM_PKGNAME = "@fimbul/ve"

inherit npmhelper
inherit native

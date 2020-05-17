SUMMARY = "NPM: @fimbul/bifrost"
DESCRIPTION = "Compatibility layer for TSLint rules"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

DEPENDS = "npm-fimbul-ymir-native npm-get-caller-file-native npm-tslib-native npm-tsutils-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://registry.npmjs.org/@fimbul/bifrost/-/bifrost-0.21.0.tgz"
SRC_URI[md5sum] = "cfb0d53343a82fcfd0a1ac0a1fccf89a"
SRC_URI[sha256sum] = "e6dc2683223af7114fcc598f4d713f7fd4bfa964aafa10eaf1a8531b79d4a55e"

NPM_PKGNAME = "@fimbul/bifrost"

inherit npmhelper
inherit native

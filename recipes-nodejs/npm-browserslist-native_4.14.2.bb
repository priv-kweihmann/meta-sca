SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.14.2.tgz"
SRC_URI[md5sum] = "7aa7992001857615899b398c61c1f043"
SRC_URI[sha256sum] = "c17139478f9af88cde1abe0f3b5c9e00d0129d24878a3d94c9a989acaeabd33c"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

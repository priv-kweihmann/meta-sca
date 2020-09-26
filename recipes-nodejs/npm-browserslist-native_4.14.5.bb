SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.14.5.tgz"
SRC_URI[md5sum] = "a4e71419e1547a08d66ff95ae844183e"
SRC_URI[sha256sum] = "25153855445300593e28a31cea4e2c47a41c2b44e0f7d4de84edb581edbdcf6c"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-colorette-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.16.8.tgz"
SRC_URI[md5sum] = "7bfee2e1130dd40d8b5a73dae4bb8de6"
SRC_URI[sha256sum] = "cea6be3e81ce6f83519c1199de98932c306939a6e447f0a8a1310f8ebf75e79d"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

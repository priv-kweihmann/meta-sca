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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.16.1.tgz"
SRC_URI[md5sum] = "5eefec51fb3ff0af96ca9f9d39d0d4e9"
SRC_URI[sha256sum] = "95fed0c6db87ca039ffe038ff8eed997fbf2ec820b3790d566d4b315acdc7ca2"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

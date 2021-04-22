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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.16.5.tgz"
SRC_URI[md5sum] = "0cb4702271c1c3817a7cdb55282d7c85"
SRC_URI[sha256sum] = "d0a061da03ee3f9589d7b768780e80d3a267e23e915a0572119e42838fcad699"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-nanocolors-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.17.2.tgz"
SRC_URI[md5sum] = "fb5b5057b051ea69941c9050e25726b8"
SRC_URI[sha256sum] = "04bc8a5c82cb8cb97a6ae0f34382fae5602a22affc04a2d25234ec840156b29c"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

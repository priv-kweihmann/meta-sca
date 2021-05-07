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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.16.6.tgz"
SRC_URI[md5sum] = "28c10f742c3d4b3daa5fdf20c2403cee"
SRC_URI[sha256sum] = "438d08e520e550518dcc5964c61a5a0013b1f53c39503d1a82194cf1aad33213"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.17.0.tgz"
SRC_URI[md5sum] = "d6f84080b2735eb63fbd1d1e7a5b4640"
SRC_URI[sha256sum] = "81f18c780bca4787e03d53060bc6c5778a899c49bf705248551693c0c669fd45"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

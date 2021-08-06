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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.16.7.tgz"
SRC_URI[md5sum] = "01cda033244413bb5b050e7cf266db0e"
SRC_URI[sha256sum] = "50f0f3e26ef6398127dbd56e25476e61877676ff8d576ac21ed600a7708754db"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

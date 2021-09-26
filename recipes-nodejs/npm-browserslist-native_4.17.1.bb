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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.17.1.tgz"
SRC_URI[md5sum] = "b6562d2c05c6e3d5e1a4e8da1dc8c6cc"
SRC_URI[sha256sum] = "7418d5dc866f2d26ce51940b0f6bccfaa80eff2ecefdceb314b309e71d5d1c14"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

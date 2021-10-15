SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native \
           npm-picocolors-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.17.4.tgz"
SRC_URI[md5sum] = "183423fb9c9478d49a1d4f422e8249b4"
SRC_URI[sha256sum] = "b24182294c9081f85eac743b89acbc518df9ec6d97e9658a6932cb0dbe03e3d3"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

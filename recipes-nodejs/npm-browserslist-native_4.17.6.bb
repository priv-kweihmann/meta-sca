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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.17.6.tgz"
SRC_URI[md5sum] = "0451608c6dface669a07397d06b40bf0"
SRC_URI[sha256sum] = "9604937e0f75b74e268b8f86d8338e7054a46a163235d8258f139039f7907003"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

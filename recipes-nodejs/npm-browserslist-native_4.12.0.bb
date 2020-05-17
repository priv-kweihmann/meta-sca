SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

DEPENDS = "npm-caniuse-lite-native npm-electron-to-chromium-native npm-node-releases-native npm-pkg-up-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.12.0.tgz"
SRC_URI[md5sum] = "e3ea75020715c3c623a981ea0c93e0ea"
SRC_URI[sha256sum] = "b9bd3206d90dbd7db73d6399bf4c62e6d62b49d5096939b1f46246911f52b754"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

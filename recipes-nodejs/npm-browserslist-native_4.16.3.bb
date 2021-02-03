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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.16.3.tgz"
SRC_URI[md5sum] = "d814fed9ab7730c8d549d02ecde4c1cf"
SRC_URI[sha256sum] = "7858e7c65bdfccbd6efea8a4822c9767ee1d9de5859154d975ef14399faa21f2"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

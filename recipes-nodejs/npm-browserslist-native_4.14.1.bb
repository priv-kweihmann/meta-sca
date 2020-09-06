SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.14.1.tgz"
SRC_URI[md5sum] = "2ee4dbe62babd3f56eae438b88141ace"
SRC_URI[sha256sum] = "0868b10f4beeaa2cb70fcfde1b6ab47dc1766e35692ae49c9efcfd585bff9f82"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

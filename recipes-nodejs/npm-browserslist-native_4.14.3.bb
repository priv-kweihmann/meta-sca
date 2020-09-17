SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.14.3.tgz"
SRC_URI[md5sum] = "7974802998976b85a11e79689dd42ca9"
SRC_URI[sha256sum] = "a4652e3ba81724da253c5f7b7c2a4505551c8ce161eaad63ffa735b262c50900"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.14.4.tgz"
SRC_URI[md5sum] = "85a7c0c977004aa5bc25ec233e98e80a"
SRC_URI[sha256sum] = "0a074b95c22587669bcdd1f9e4b1cef7b47858eda448af6cbca48ae1988814da"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

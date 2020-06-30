SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.12.2.tgz"
SRC_URI[md5sum] = "85314d68ea347e6479333f86b6288927"
SRC_URI[sha256sum] = "f9804f52b8c8d1dbc21338198008bed2a24d46f2a63dbc2b74f8f098e47925a3"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

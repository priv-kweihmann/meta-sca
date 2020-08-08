SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.14.0.tgz"
SRC_URI[md5sum] = "efca38cbe33bbd8ee83df6e407f6d5b5"
SRC_URI[sha256sum] = "d6b3d195114777305b4af61024d690a8f2dbe4d5775b699dd00a85223f990c3c"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

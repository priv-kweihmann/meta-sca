SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.14.6.tgz"
SRC_URI[md5sum] = "5e4d2dc52b3fda5660d23ea1a684175f"
SRC_URI[sha256sum] = "10a68886f540e9f63c1a9848ad6a3d723391d4a10082c303f8127875dbd5d7df"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

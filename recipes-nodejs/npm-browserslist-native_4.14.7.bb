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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.14.7.tgz"
SRC_URI[md5sum] = "b38c5929f78936448de2611960c188a6"
SRC_URI[sha256sum] = "32007593d8eeac83aaeaff25b1e40b129ce61e81e25d1780eaddc0f4c925eab6"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

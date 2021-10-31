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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.17.5.tgz"
SRC_URI[md5sum] = "b492ca1f4fd1931eae73b00d2a69db5a"
SRC_URI[sha256sum] = "668493f799865b399571e31eba3db0760ede662cc2032750ee13a10d1bc52cf4"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

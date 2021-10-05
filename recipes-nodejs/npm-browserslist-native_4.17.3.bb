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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.17.3.tgz"
SRC_URI[md5sum] = "63b83fcf9a9766fdcf837ed3b1ccc36b"
SRC_URI[sha256sum] = "6cd644b3b90acfb5791829b33ac684c7a637fa73e56e55f7f06795e2094a3093"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

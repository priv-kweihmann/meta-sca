SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.13.0.tgz"
SRC_URI[md5sum] = "07aff2cadb0c32efe991e03668904d0f"
SRC_URI[sha256sum] = "b2b65aa8eb1702d3101aae5c81db3ff2ba1d25d96168b10bb47294c62da2bb4c"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

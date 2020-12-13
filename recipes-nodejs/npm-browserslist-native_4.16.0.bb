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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.16.0.tgz"
SRC_URI[md5sum] = "642d40afb1d6e91e06ed64a3bd43ebca"
SRC_URI[sha256sum] = "582ee4a514dbf5e03e1fe7d236663378189f35d19edcb537001c8f5998f4c3ca"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

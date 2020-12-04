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

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.15.0.tgz"
SRC_URI[md5sum] = "637b9a02ac18c4266621dd433bbc9d60"
SRC_URI[sha256sum] = "bfa42200398f55a4773fb330392a48c8d6712348e1d4e13f49730e3f3a7981a7"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

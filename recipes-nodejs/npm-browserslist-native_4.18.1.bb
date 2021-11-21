SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native \
           npm-picocolors-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.18.1.tgz"
SRC_URI[md5sum] = "2ee25ee88793df102eb3b3694a4d2770"
SRC_URI[sha256sum] = "d915039d3b7d197eecf3a8305d12a9748e0daa37278daa893acd35ca0557e253"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

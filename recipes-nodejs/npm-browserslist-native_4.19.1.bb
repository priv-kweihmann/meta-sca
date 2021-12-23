SUMMARY = "NPM: browserslist"
DESCRIPTION = "Share target browsers between different front-end tools, like Autoprefixer, Stylelint and babel-env-preset"
HOMEPAGE = "https://github.com/browserslist/browserslist#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30b83181ea8907820ccb681d5ed60277"

DEPENDS = "npm-caniuse-lite-native \
           npm-electron-to-chromium-native \
           npm-escalade-native \
           npm-node-releases-native \
           npm-picocolors-native"

SRC_URI = "https://registry.npmjs.org/browserslist/-/browserslist-4.19.1.tgz"
SRC_URI[md5sum] = "98fbe518b74960ee170a1fe8877711c6"
SRC_URI[sha256sum] = "f11e687a4210175a5a4e36f474fe806bd2546f77901e804664ec2525c3815b1c"

NPM_PKGNAME = "browserslist"

inherit npmhelper
inherit native

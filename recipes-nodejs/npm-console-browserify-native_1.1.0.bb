SUMMARY = "NPM: console-browserify"
DESCRIPTION = "Emulate console for all the browsers"
HOMEPAGE = "https://github.com/Raynos/console-browserify"

DEPENDS = "npm-date-now-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=8966d3100f2d871ee216d056c0ea0160"

SRC_URI = "https://registry.npmjs.org/console-browserify/-/console-browserify-1.1.0.tgz"
SRC_URI[md5sum] = "d5e46fe7e61aad2635832e424d127303"
SRC_URI[sha256sum] = "ddec38650f2e8222cf11cd606b049deac50d04712c88d061decd4de650a3cb49"

S = "${WORKDIR}/package"

NPM_PKGNAME = "console-browserify"

inherit npmhelper
inherit native

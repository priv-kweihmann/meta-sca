SUMMARY = "NPM: chalk"
DESCRIPTION = "Terminal string styling done right"
HOMEPAGE = "https://github.com/chalk/chalk#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-styles-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/chalk/-/chalk-4.1.0.tgz"
SRC_URI[md5sum] = "fb1ed3c5c2dcd6c13f44fd40573372d4"
SRC_URI[sha256sum] = "7a21b3759f36a3961e4f7d483490d29191d713b11d4f1b0f220534310f3d44aa"

NPM_PKGNAME = "chalk"

inherit npmhelper
inherit native

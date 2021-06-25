SUMMARY = "NPM: @secretlint/config-validator"
DESCRIPTION = ".secretlintrc config validation library"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-validator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-validator/-/config-validator-3.1.0.tgz"
SRC_URI[md5sum] = "58323bff6ceab502623b1b36f4ff2a11"
SRC_URI[sha256sum] = "02f95bb5ea85646a90929a709cb1f1438d1a5c1081b1cc94708bafcdb79b1858"

NPM_PKGNAME = "@secretlint/config-validator"

inherit npmhelper
inherit native

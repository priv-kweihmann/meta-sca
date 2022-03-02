SUMMARY = "NPM: @secretlint/config-validator"
DESCRIPTION = ".secretlintrc config validation library"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-validator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-validator/-/config-validator-4.2.0.tgz"
SRC_URI[md5sum] = "24268878a7faf2be96687ec72f4aa850"
SRC_URI[sha256sum] = "b22d306b0ccda4c0514a36f1dd03d18bb3d34721391f9332379ee92872eba791"

NPM_PKGNAME = "@secretlint/config-validator"

inherit npmhelper
inherit native

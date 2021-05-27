SUMMARY = "NPM: @secretlint/config-validator"
DESCRIPTION = ".secretlintrc config validation library"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-validator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-validator/-/config-validator-2.2.0.tgz"
SRC_URI[md5sum] = "e27973b90908fe47bcdc6cebac72e540"
SRC_URI[sha256sum] = "d0166a7061f4bb0dc97850e484a5ef3733361422710f07bec5d5cec7923e4735"

NPM_PKGNAME = "@secretlint/config-validator"

inherit npmhelper
inherit native

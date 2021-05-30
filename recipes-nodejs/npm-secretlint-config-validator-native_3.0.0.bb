SUMMARY = "NPM: @secretlint/config-validator"
DESCRIPTION = ".secretlintrc config validation library"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-validator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-validator/-/config-validator-3.0.0.tgz"
SRC_URI[md5sum] = "5dedc54d02d23360686b6c68305e43c4"
SRC_URI[sha256sum] = "ddbc5a5fdc08d7439f193200269fd4b51e5bf010662e45cd621a00029a228c52"

NPM_PKGNAME = "@secretlint/config-validator"

inherit npmhelper
inherit native

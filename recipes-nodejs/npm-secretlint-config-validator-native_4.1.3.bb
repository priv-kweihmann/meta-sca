SUMMARY = "NPM: @secretlint/config-validator"
DESCRIPTION = ".secretlintrc config validation library"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-validator/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-validator/-/config-validator-4.1.3.tgz"
SRC_URI[md5sum] = "9f5ea93dfc8ae6e060dc0770c85d7558"
SRC_URI[sha256sum] = "7ac939d8355137b4ff6c284bd9e5b083a21a2fae11a294a3077a766af72fa5e8"

NPM_PKGNAME = "@secretlint/config-validator"

inherit npmhelper
inherit native

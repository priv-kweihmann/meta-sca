SUMMARY = "NPM: @secretlint/config-validator"
DESCRIPTION = ".secretlintrc config validation library"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-validator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-validator/-/config-validator-4.0.0.tgz"
SRC_URI[md5sum] = "1c4adc149376cbbaf2a74679d55aaf02"
SRC_URI[sha256sum] = "ad98490c6c6faa79a02322844d64e69d92d527b52be4e4250d3b81cae4067e7d"

NPM_PKGNAME = "@secretlint/config-validator"

inherit npmhelper
inherit native

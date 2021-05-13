SUMMARY = "NPM: @secretlint/config-validator"
DESCRIPTION = ".secretlintrc config validation library"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-validator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-validator/-/config-validator-2.1.1.tgz"
SRC_URI[md5sum] = "1fed79eec9ecf64de8c3fc347e03ad9f"
SRC_URI[sha256sum] = "5d05be408be4f27ef545f88abb9b4fd1facd6b215173169d1c3a3a2aee589095"

NPM_PKGNAME = "@secretlint/config-validator"

inherit npmhelper
inherit native

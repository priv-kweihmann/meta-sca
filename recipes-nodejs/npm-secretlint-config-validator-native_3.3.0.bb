SUMMARY = "NPM: @secretlint/config-validator"
DESCRIPTION = ".secretlintrc config validation library"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-validator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-validator/-/config-validator-3.3.0.tgz"
SRC_URI[md5sum] = "94c776fc855593e4c9aaee87e3cfe0eb"
SRC_URI[sha256sum] = "2391dcc0eadf835d145ee8d550a33f834732f59184b696e9548bd88f69229340"

NPM_PKGNAME = "@secretlint/config-validator"

inherit npmhelper
inherit native

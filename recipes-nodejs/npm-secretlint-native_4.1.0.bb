SUMMARY = "NPM: secretlint"
DESCRIPTION = "Secretlint CLI that scan secret/credential data."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/secretlint/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-globby-native \
           npm-meow-native \
           npm-read-pkg-native \
           npm-secretlint-config-creator-native \
           npm-secretlint-formatter-native \
           npm-secretlint-node-native \
           npm-secretlint-profiler-native"

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-4.1.0.tgz"
SRC_URI[md5sum] = "83750acaac2e0755ff8b9f605f6ac3c5"
SRC_URI[sha256sum] = "448934058b33c5d6554da93b195755554b49b9037825e8902bcb3078c16ad9c4"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

SUMMARY = "NPM: secretlint"
DESCRIPTION = "Secretlint CLI that scan secret/credential data."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/secretlint/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-4.1.4.tgz"
SRC_URI[md5sum] = "98e599d167346c29947cbde79a1024a4"
SRC_URI[sha256sum] = "63266340e44d7e86af850fa3a0cd7213a88c83022ef9be4b0f56420dff461ed1"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

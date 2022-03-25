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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-5.1.1.tgz"
SRC_URI[md5sum] = "d267557b62355c6f4be3f6600750381d"
SRC_URI[sha256sum] = "1954b78512944c0cdd4d52b703a19635e3f49455b23940a6a727c686982f549f"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

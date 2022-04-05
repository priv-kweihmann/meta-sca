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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-5.1.3.tgz"
SRC_URI[md5sum] = "20206305459c2390561b773bd4523cc2"
SRC_URI[sha256sum] = "9b690e7d3cb4e05f2e3d41968460c6c1ba79d71eac160c17aebf0dc71a4167ab"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

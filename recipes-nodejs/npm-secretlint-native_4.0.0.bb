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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-4.0.0.tgz"
SRC_URI[md5sum] = "0a2fecfc593e74ad5c0e05908f3da6e7"
SRC_URI[sha256sum] = "79ea7125f9d60d521b32e42bfca2de833c824973cab5536d427a8b66d92c6962"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

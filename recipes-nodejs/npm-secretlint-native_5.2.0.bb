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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-5.2.0.tgz"
SRC_URI[md5sum] = "207721b361b96a679e44e51745f68002"
SRC_URI[sha256sum] = "cb545606ba9d984c198f79828451ec473beafac44772a7cb22295aadefbd04e4"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

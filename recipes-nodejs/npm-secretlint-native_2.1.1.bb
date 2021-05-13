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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-2.1.1.tgz"
SRC_URI[md5sum] = "e30c8cdc14aa63bb7c657b0c0f77b002"
SRC_URI[sha256sum] = "a3f8c4845641bcbea3013af488a1aed72106406aeb4837baca5dea4719890654"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-3.1.0.tgz"
SRC_URI[md5sum] = "c2aed723c666b66a47dc3484c005f948"
SRC_URI[sha256sum] = "0e63b6b286b8932507c96b9dedd1250e4fbd3ec3bfd6d87daf476c515208e04f"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

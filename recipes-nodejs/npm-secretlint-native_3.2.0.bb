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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-3.2.0.tgz"
SRC_URI[md5sum] = "c427189f0734d6b065810edfdc9a0538"
SRC_URI[sha256sum] = "fc51743485f79b928ab893beeccc51eead00d8f02f4c6d869de2e225bddfed08"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

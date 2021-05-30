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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-3.0.0.tgz"
SRC_URI[md5sum] = "6ffe554c2538d10acafb8ed81dd292fa"
SRC_URI[sha256sum] = "dc1116fccb58cd181323c9989828a2dcdeffd04f134e32914860ad8008accf66"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native

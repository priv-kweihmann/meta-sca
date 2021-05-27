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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-2.2.0.tgz"
SRC_URI[md5sum] = "a811a637a6dfe489970330375aa97416"
SRC_URI[sha256sum] = "eb140a87944025cd7b15f10faddf3a0a64c3a679925d2c4a5b631acf498b23c7"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native
